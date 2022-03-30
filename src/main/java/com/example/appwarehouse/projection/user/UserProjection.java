package com.example.appwarehouse.projection.user;

import com.example.appwarehouse.model.entity.user.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface UserProjection {
    Long getId();
    String getName();
    String getUsername();
    String getPassword();
    String getPhoneNumber();
}
