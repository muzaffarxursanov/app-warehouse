package com.example.appwarehouse.projection;

import com.example.appwarehouse.model.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface WarehouseProjection {
    Long getId();
    String getName();
    Boolean getActive();
}
