package com.dmall.productserivce.application;

import com.dmall.productserivce.apis.dto.ProductCreationRequest;
import com.dmall.productserivce.domain.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class ProductFactory {

  protected static final ModelMapper mapper = new ModelMapper();

  public Product create(String name, String description, BigDecimal price, Boolean isOnSale) {
    return Product.builder()
        .name(name)
        .description(description)
        .price(price)
        .isOnSale(isOnSale)
        .build();
  }
}
