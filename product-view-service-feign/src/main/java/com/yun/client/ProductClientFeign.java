package com.yun.client;

import com.yun.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
 
    @GetMapping("/products")
    public List<Product> listProdcuts();
}