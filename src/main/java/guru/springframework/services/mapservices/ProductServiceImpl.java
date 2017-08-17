package guru.springframework.services.mapservices;

import guru.springframework.domain.DomainObject;
import guru.springframework.domain.Product;
import guru.springframework.services.*;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by El-Feky on 7/20/17.
 */
@Service
@Profile("map")
public class ProductServiceImpl extends AbstractMapService implements ProductService {
    //TODO : Adjust product to match Customer
    //private Map<Integer,Product> products;

    //public ProductServiceImpl() {
    //    loadProducts();
    //}

    //@Override
    //public List<Product> listAllProducts() {
    //    return new ArrayList<>(products.values());
    //}

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
        //return products.get(id);
    }

    //@Override
    //public Product saveOrUpdateProduct(Product product) {
    //    if(product != null){
    //        if (product.getId() == null){
    //            product.setId(getNextKey());
    //        }
    //        products.put(product.getId(),product);
    //        return product;
    //    } else
    //        throw new RuntimeException("Product can't be null");
    //}

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        //products.remove(id);
        super.delete(id);
    }

   // private Integer getNextKey(){
     //   return Collections.max(products.keySet())+1;
    //}


}
