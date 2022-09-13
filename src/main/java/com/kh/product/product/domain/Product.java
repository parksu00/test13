package com.kh.product.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  private Long productId;    //상품번호
  private String  pname;        //상품명
  private Integer count;     //상품수량
  private Integer price;        //상품가격
}