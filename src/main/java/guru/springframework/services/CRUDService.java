package guru.springframework.services;

/**
 * Created by El-Feky on 7/23/17.
 */
import java.util.List;

public interface CRUDService<C> {

    List<?> listAll();

    C getById(Integer id);

    C saveOrUpdate(C domainObject);

    void delete(Integer id);


}
