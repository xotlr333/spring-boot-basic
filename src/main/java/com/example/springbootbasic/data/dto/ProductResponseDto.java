package com.example.springbootbasic.data.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Setter
@Getter
public class ProductResponseDto {

    private Long number;
    private String name;
    private int price;
    private int stock;

}
