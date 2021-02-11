package com.sureshonetomany.jpa.service;

import com.sureshonetomany.jpa.dto.Customerdto;
import com.sureshonetomany.jpa.entity.Customer;
import com.sureshonetomany.jpa.entity.Product;
import com.sureshonetomany.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public  class CustomerImpl implements Customerservice {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public String createcustomer(Customerdto request){
        Customer customer=new Customer();
        customer.setId(request.getId());
        customer.setName(request.getName());
        customer.setGender(request.getGender());

        List<Product> ProductList=new ArrayList<>();
      for(Customerdto.Product productdto:request.getProducts()) {
          Product product = new Product();
          product.setPid(productdto.getPid());
          product.setProductName(productdto.getProductName());
          product.setPrice(productdto.getPrice());
          product.setQty(productdto.getQty());
          product.setCustomer(customer);
          ProductList.add(product);
      }
      customer.setProducts(ProductList);
       customerRepository.save(customer);
       return "success";
    }
    @Override
    public String addProducts (Customerdto request) {
        Customer customer=new Customer();
        customer.setId(request.getId());
        List<Product> ProductList=new ArrayList<>();
        for(Customerdto.Product productdto:request.getProducts()) {
            Product product = new Product();
            product.setPid(productdto.getPid());
            product.setProductName(productdto.getProductName());
            product.setPrice(productdto.getPrice());
            product.setQty(productdto.getQty());
            product.setCustomer(customer);
            ProductList.add(product);
        }
        customer.setProducts(ProductList);
        customerRepository.save(customer);
        return "success";

    }

}
