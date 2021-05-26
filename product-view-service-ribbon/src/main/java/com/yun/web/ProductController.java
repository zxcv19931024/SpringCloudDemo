package com.yun.web;


import com.yun.pojo.Product;
import com.yun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object getProducts(Model m){
        List<Product> ps=productService.listProducts();
        m.addAttribute("ps",ps);
        return "products";
    }
}
