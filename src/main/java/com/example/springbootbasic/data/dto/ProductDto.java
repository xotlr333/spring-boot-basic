package com.example.springbootbasic.data.dto;

import lombok.*;

@AllArgsConstructor
@Builder
@ToString
@Setter
@Getter
public class ProductDto {

    private String name;
    private int price;
    private int stock;
}
