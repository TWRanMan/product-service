package com.dmall.productservice.apis.assembler;

import com.dmall.productservice.apis.dto.ProductCreationRequest;
import com.dmall.productservice.application.ProductFactory;
import com.dmall.productservice.domain.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductAssembler {


  protected static final ModelMapper mapper = new ModelMapper();

  @Autowired
  private ProductFactory productFactory;
  private final boolean isOnSale = false;

  public Product toDomainObject(ProductCreationRequest creationRequest) {
    return productFactory.create(creationRequest.getName(),
        creationRequest.getDescription(), creationRequest.getPrice(), isOnSale);
  }

  public ProductCreationRequest toDto(Product product) {
    return mapper.map(product, ProductCreationRequest.class);
  }
}