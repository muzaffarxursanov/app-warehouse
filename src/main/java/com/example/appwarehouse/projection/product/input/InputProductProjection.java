package com.example.appwarehouse.projection.product.input;

import com.example.appwarehouse.model.entity.product.Product;
import com.example.appwarehouse.model.entity.product.input.Input;
import com.example.appwarehouse.model.entity.product.input.InputProduct;
import com.example.appwarehouse.model.entity.product.output.Output;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {
    Long getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpiryDate();
    Input getInput();
}
