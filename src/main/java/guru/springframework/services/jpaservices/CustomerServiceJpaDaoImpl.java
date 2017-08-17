package guru.springframework.services.jpaservices;

import guru.springframework.domain.Customer;
import guru.springframework.services.CustomerService;
import guru.springframework.services.security.EncryptionService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by El-Feky on 8/16/17.
 */
@Service
@Profile("jpadao")
public class CustomerServiceJpaDaoImpl extends AbstractJpaDaoService implements CustomerService {

    private EncryptionService encryptionService;

    @Autowired
    public void setEncryptionService(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    //private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<?> listAll() {
        EntityManager em = emf.createEntityManager();

        return em.createQuery("from Customer",Customer.class).getResultList();
    }

    @Override
    public Customer getById(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Customer.class,id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //TODO: Add Password
        if (domainObject.getUser() != null && domainObject.getUser().getPassword() != null) {
            domainObject.getUser().setEncryptedPassword(
                    encryptionService.encryptString(domainObject.getUser().getPassword()));
        }

        Customer savedCustomer = em.merge(domainObject);
        em.getTransaction().commit();
        return savedCustomer;
    }

    @Override
    public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Customer.class,id));
        em.getTransaction().commit();
    }
}
