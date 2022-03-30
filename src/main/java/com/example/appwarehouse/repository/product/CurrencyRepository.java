package com.example.appwarehouse.repository.product;

import com.example.appwarehouse.model.entity.product.Currency;
import com.example.appwarehouse.projection.product.CurrencyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
