package com.example.appwarehouse.repository.product.output;

import com.example.appwarehouse.model.entity.product.output.OutputProduct;
import com.example.appwarehouse.projection.product.output.OutputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output-product", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}
