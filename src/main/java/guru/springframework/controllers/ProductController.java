package guru.springframework.controllers;

import guru.springframework.domain.Product;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by El-Feky on 7/20/17.
 */
@RequestMapping("/product")
@Controller
public class ProductController {

    private ProductService productService;
    @Autowired
    public void setProductService(ProductService productService) {

        this.productService = productService;
    }

    @RequestMapping("/list")
    public String listProducts(Model model){
        model.addAttribute("products",productService.listAll());
        return "product/list";
    }
    @RequestMapping("/show/{id}")
    public String getProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product",productService.getById(id));
        return "product/show";
    }
    @RequestMapping("/new")
    public String newProduct(Model model){
        model.addAttribute("product",new Product());
        return "product/productform";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "product/productform";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveOrUpdateProduct(Product product){
        Product savedProduct = productService.saveOrUpdate(product);
        return "redirect:product/show/"+ savedProduct.getId();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        productService.delete(id);

        return "redirect:/product/list";
    }

}
