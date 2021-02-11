package com.sureshonetomany.jpa.controller;

import com.sureshonetomany.jpa.entity.Product;
import com.sureshonetomany.jpa.service.Productservice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    Productservice service;
    @PostMapping("/addproducts")
    public List<Product> addproducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
}
