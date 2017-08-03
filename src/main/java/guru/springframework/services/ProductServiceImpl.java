package guru.springframework.services;

import guru.springframework.domain.DomainObject;
import guru.springframework.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by El-Feky on 7/20/17.
 */
@Service
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

    @Override
    protected void loadDomainObjects() {
        domainMap = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");

        domainMap.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");

        domainMap.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");

        domainMap.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");

        domainMap.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product 2");
        product5.setPrice(new BigDecimal("25.99"));
        product5.setImageUrl("http://example.com/product5");

        domainMap.put(5, product5);
    }


}
