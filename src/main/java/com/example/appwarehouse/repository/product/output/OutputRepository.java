package com.example.appwarehouse.repository.product.output;

import com.example.appwarehouse.model.entity.product.output.Output;
import com.example.appwarehouse.projection.product.output.OutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
}
