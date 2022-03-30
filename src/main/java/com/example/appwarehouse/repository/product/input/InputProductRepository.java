package com.example.appwarehouse.repository.product.input;

import com.example.appwarehouse.model.entity.product.input.InputProduct;
import com.example.appwarehouse.projection.product.input.InputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input-product", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
