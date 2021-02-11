package com.sureshonetomany.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customerdto {

    private String id;
    private String name;
    private String gender;
    List<Product> products;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Product {
        private String pid;
        private String productName;
        private int qty;
        private int price;
    }

}
