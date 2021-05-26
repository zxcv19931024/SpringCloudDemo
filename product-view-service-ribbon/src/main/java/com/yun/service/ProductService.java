package com.yun.service;

import com.yun.client.ProductClientRibbon;
import com.yun.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){
        return productClientRibbon.getProducts();
 
    }
}