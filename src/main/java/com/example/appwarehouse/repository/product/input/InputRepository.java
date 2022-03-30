package com.example.appwarehouse.repository.product.input;

import com.example.appwarehouse.model.entity.product.input.Input;
import com.example.appwarehouse.projection.product.input.InputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Long> {
}
