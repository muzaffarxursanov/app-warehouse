package com.example.appwarehouse.model.entity.product.input;

import com.example.appwarehouse.model.entity.product.Product;
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
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Product product;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private Date expiryDate;
    @ManyToOne
    private Input input;
}
