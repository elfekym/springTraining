package guru.springframework.services.mapservices;

import guru.springframework.domain.Customer;
import guru.springframework.domain.DomainObject;
import guru.springframework.services.*;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/**
 * Created by El-Feky on 7/23/17.
 */
@Service
@Profile("map")
public class CustomerServiceImpl extends AbstractMapService implements CustomerService {
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }


}
