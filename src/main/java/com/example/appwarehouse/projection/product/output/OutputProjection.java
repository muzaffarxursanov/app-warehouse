package com.example.appwarehouse.projection.product.output;

import com.example.appwarehouse.model.entity.Warehouse;
import com.example.appwarehouse.model.entity.product.Currency;
import com.example.appwarehouse.model.entity.product.output.Output;
import com.example.appwarehouse.model.entity.user.WarehouseUser;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Output.class)
public interface OutputProjection {
    Long getId();
    Date getDate();
    Warehouse getWarehouse();
    WarehouseUser getClient();
    Currency getCurrency();
}