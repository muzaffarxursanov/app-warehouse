package com.example.appwarehouse.projection.product.output;

import com.example.appwarehouse.model.entity.product.Product;
import com.example.appwarehouse.model.entity.product.output.Output;
import com.example.appwarehouse.model.entity.product.output.OutputProduct;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
    Long getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpiryDate();
    Output getOutput();
}
