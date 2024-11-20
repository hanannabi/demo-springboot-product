package com.example.product.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class ProductUpdate {
    int price;
    String name;
}
