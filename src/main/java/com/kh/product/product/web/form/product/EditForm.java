package com.kh.product.product.web.form.product;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EditForm {
  private Long productId;       //상품아이디
  private String pname;         //상품명
  private Integer count;     //수량
  private Integer price;        //가격
}