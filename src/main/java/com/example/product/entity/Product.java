package com.example.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class Product {

    @Id
    Long id;
    String name;
    int price;
    int manufacturingYear;
}
