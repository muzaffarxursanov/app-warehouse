package com.example.appwarehouse.repository.product;

import com.example.appwarehouse.model.entity.product.Measurement;
import com.example.appwarehouse.projection.product.MeasurementProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
