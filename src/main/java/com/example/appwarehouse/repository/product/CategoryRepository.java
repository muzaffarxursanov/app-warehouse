package com.example.appwarehouse.repository.product;

import com.example.appwarehouse.model.entity.product.Category;
import com.example.appwarehouse.projection.product.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
