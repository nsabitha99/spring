package com.sureshonetomany.jpa.service;

import com.sureshonetomany.jpa.entity.Customer;
import com.sureshonetomany.jpa.entity.Product;
import com.sureshonetomany.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements Productservice {
    @Autowired
    ProductRepository productRepository;
    public List<Product> saveProducts(List<Product> products){
        Customer customer=new Customer();
        /*customer.setId(products.getId());
        customer.setName(request.getName());
        customer.setGender(request.getGender());*/
        return productRepository.saveAll(products);
    }
}
