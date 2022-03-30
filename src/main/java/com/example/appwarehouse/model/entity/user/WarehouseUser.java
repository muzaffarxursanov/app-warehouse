package com.example.appwarehouse.model.entity.user;

import com.example.appwarehouse.model.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class WarehouseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private User user;
    @Column(nullable = false)
    private Role role;
    @Column(nullable = false)
    private boolean active;
}
