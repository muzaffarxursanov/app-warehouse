package com.example.appwarehouse.projection.product;

import com.example.appwarehouse.model.entity.product.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryProjection {
    Long getId();
    String getName();
    Boolean getActive();
}
