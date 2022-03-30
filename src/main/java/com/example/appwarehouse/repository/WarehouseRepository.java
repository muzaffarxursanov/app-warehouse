package com.example.appwarehouse.repository;

import com.example.appwarehouse.model.entity.Warehouse;
import com.example.appwarehouse.projection.WarehouseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
