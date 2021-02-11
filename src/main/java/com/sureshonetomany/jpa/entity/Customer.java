package com.sureshonetomany.jpa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customertb")
public class Customer {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="gender")
    private String gender;

   @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
   @Cascade({ org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE_ORPHAN })
   @JsonManagedReference
    private List<Product> products;

}
