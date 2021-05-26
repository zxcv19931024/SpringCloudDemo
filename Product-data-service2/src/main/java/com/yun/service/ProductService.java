package com.yun.service;


import com.yun.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Value("${server.port}")
    String port;

    public List<Product> productList(){
        List<Product> ps=new ArrayList<>();
        ps.add(new Product(1,"A:"+port,100));
        ps.add(new Product(2,"B:"+port,200));
        ps.add(new Product(3,"C:"+port,300));
        return ps;
    }

}
