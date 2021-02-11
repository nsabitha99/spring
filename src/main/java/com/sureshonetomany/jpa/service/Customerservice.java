package com.sureshonetomany.jpa.service;

import com.sureshonetomany.jpa.dto.Customerdto;
import org.springframework.stereotype.Service;

@Service
public interface Customerservice {
    public String createcustomer (Customerdto request) ;
    public String addProducts (Customerdto request) ;

}
