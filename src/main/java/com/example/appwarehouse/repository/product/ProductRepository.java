package com.example.appwarehouse.repository.product;

import com.example.appwarehouse.model.entity.product.Product;
import com.example.appwarehouse.projection.product.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}
