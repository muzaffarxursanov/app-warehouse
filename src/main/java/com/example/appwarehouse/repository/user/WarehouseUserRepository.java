package com.example.appwarehouse.repository.user;

import com.example.appwarehouse.model.entity.user.WarehouseUser;
import com.example.appwarehouse.projection.user.WarehouseUserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse-user", excerptProjection = WarehouseUserProjection.class)
public interface WarehouseUserRepository extends JpaRepository<WarehouseUser, Long> {
}
