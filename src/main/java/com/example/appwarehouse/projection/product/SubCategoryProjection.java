package com.example.appwarehouse.projection.product;

import com.example.appwarehouse.model.entity.product.Category;
import com.example.appwarehouse.model.entity.product.SubCategory;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = SubCategory.class)
public interface SubCategoryProjection {
    Long getId();
    String getName();
    Category getCategory();
    Boolean getActive();
}
