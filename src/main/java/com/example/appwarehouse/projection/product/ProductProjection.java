package com.example.appwarehouse.projection.product;

import com.example.appwarehouse.model.entity.attachment.Attachment;
import com.example.appwarehouse.model.entity.product.Measurement;
import com.example.appwarehouse.model.entity.product.Product;
import com.example.appwarehouse.model.entity.product.SubCategory;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Product.class)
public interface ProductProjection {
    Long getId();
    String getName();
    SubCategory getSubCategory();
    List<Attachment> getAttachments();
    Measurement getMeasurement();
    Boolean getActive();
}
