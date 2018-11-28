
package com.dmall.productserivce.infrastructure.repositories.dataentity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductDataEntity {
  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String name = null;

  @Column
  private String description = null;

  @Column
  private Integer quantity = null;

  @Column
  private BigDecimal price = null;

  @Column
  private Boolean isOnSale = null;
}

