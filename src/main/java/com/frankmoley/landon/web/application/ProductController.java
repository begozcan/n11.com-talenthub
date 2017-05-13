package com.frankmoley.landon.web.application;

import com.frankmoley.landon.business.domain.Shopping;
import com.frankmoley.landon.business.service.ProductService;
import com.frankmoley.landon.data.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/shopping")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method= RequestMethod.GET)
    public String getProducts(Model model){
        List<Shopping> productList = productService.getAllProducts();
        model.addAttribute("shoppingList", productList);
        return "shopping";
    }

    @RequestMapping(value = "/", method= RequestMethod.POST)
    public void postProduct(@ModelAttribute("product_form") Product product){
        productService.addProduct(product);
    }

    @RequestMapping(value = "/{id}", method= RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(name = "id") long productId) {
        productService.deleteProduct(productId);
    }

    @RequestMapping(value = "/", method= RequestMethod.PUT)
    public void updateProduct(@ModelAttribute("product_form") Product product){
        productService.updateProduct(product);
    }
}
