package com.example.appwarehouse.model.entity.product.output;

import com.example.appwarehouse.model.entity.Warehouse;
import com.example.appwarehouse.model.entity.product.Currency;
import com.example.appwarehouse.model.entity.user.WarehouseUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private Date date;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private WarehouseUser client;
    @ManyToOne
    private Currency currency;
}
