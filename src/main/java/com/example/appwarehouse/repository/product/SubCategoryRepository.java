package com.example.appwarehouse.repository.product;

import com.example.appwarehouse.model.entity.product.SubCategory;
import com.example.appwarehouse.projection.product.SubCategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "subcategory", excerptProjection = SubCategoryProjection.class)
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
