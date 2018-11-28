CREATE TABLE `dmall_product_db`.`product`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NULL,
  `description` varchar(2000) NULL,
  `price` decimal(10, 2) NULL,
  `is_on_sale` boolean,
  PRIMARY KEY (`id`)
);