package com.kh.product.product.web.form.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class SaveForm {
  private String pname;
  private Integer count;
  private Integer price;
}
