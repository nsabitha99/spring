package com.sureshonetomany.jpa.service;

import com.sureshonetomany.jpa.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Productservice {
    public List<Product> saveProducts(List<Product> products);

}
