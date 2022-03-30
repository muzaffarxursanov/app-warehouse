package com.example.appwarehouse.model.entity.product;

import com.example.appwarehouse.model.entity.attachment.Attachment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    private String name;
    @ManyToOne
    private SubCategory subCategory;
    @ManyToMany
    private List<Attachment> attachments;
    @ManyToOne
    private Measurement measurement;
    @Column(nullable = false)
    private boolean active;
}
