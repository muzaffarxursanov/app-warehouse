package com.example.appwarehouse.repository.user;

import com.example.appwarehouse.model.entity.user.User;
import com.example.appwarehouse.projection.user.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
