package com.sureshonetomany.jpa.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Producttbl")
public class Product {
    @Id
    @Column(name="pid")
    private String pid;
    @Column(name="productName")
    private String productName;
    @Column(name="qty")
    private int qty;
    @Column(name="price")
    private int price;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id",referencedColumnName = "id")
    @JsonBackReference
    private Customer customer;
}
