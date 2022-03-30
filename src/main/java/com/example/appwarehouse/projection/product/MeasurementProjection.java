package com.example.appwarehouse.projection.product;

import com.example.appwarehouse.model.entity.product.Measurement;
import lombok.experimental.PackagePrivate;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Long getId();
    String getName();
    Boolean getActive();
}
