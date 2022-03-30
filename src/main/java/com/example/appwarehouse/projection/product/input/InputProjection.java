package com.example.appwarehouse.projection.product.input;

import com.example.appwarehouse.model.entity.Warehouse;
import com.example.appwarehouse.model.entity.product.Currency;
import com.example.appwarehouse.model.entity.product.input.Input;
import com.example.appwarehouse.model.entity.user.WarehouseUser;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface InputProjection {
    Long getId();
    Date getDate();
    Warehouse getWarehouse();
    WarehouseUser getSupplier();
    Currency getCurrency();
}
