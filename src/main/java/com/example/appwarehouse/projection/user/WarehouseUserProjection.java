package com.example.appwarehouse.projection.user;

import com.example.appwarehouse.model.entity.Warehouse;
import com.example.appwarehouse.model.entity.user.Role;
import com.example.appwarehouse.model.entity.user.User;
import com.example.appwarehouse.model.entity.user.WarehouseUser;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WarehouseUser.class)
public interface WarehouseUserProjection {
    Long getId();
    Warehouse getWarehouse();
    User getUser();
    Role getRole();
    Boolean getActive();
}
