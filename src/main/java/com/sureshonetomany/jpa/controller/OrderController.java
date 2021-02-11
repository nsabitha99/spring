package com.sureshonetomany.jpa.controller;


import com.sureshonetomany.jpa.dto.Customerdto;
import com.sureshonetomany.jpa.service.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
     Customerservice service;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody Customerdto request){
        String msg = service.createcustomer(request);
        return msg;
    }
    @PostMapping("/addProducts")
    public String addProducts(@RequestBody Customerdto request) {
        String msg= service.addProducts(request);
        return msg;
    }



}
