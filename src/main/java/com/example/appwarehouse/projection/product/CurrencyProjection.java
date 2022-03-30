package com.example.appwarehouse.projection.product;

import com.example.appwarehouse.model.entity.product.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    Long getId();
    String getName();
    Boolean getActive();
}
