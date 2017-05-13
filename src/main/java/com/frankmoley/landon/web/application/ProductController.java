package com.frankmoley.landon.web.application;

import com.frankmoley.landon.business.domain.Shopping;
import com.frankmoley.landon.business.service.ProductService;
import com.frankmoley.landon.data.entity.Product;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import javax.validation.Valid;



@Controller
@RequestMapping(value="/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method= RequestMethod.GET)
    public String getProducts(Model model){
        List<Shopping> productList = productService.getAllProducts();
        model.addAttribute("shoppingList", productList);
        return "shopping";
    }
    @RequestMapping(value = "add",method= RequestMethod.GET)
    public ModelAndView itemAddPage(){
        ModelAndView mv = new ModelAndView("add_product","product",new Product());
        return  mv;
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String postItem(Product product){

        productService.addProduct(product);
        return "redirect:/products";
    }
///*
////
////    @RequestMapping(value = "/asdasd", method= RequestMethod.POST)
////    public void postProduct(@ModelAttribute("product_form") Product product){
////        productService.addProduct(product);
////    }
////
    @RequestMapping(value = "/{id}/edit", method= RequestMethod.GET)
   public ModelAndView deleteProduct(@PathVariable(name = "id") long productId) {
        Product product = productService.getProduct(productId);
        ModelAndView mv = new ModelAndView("edit_product","product",new Product());
        System.out.println(product);
        return  mv;
    }
////
    @RequestMapping(value = "/edit", method= RequestMethod.POST)
    public String updateProduct(Product product){
        productService.updateProduct(product);
        return "redirect:/products";
    }
}
