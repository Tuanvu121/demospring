package com.example.demo.entity.onetomany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "items")
public class Item {
    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false, referencedColumnName = "cart_id")
    @JsonBackReference
    private Cart cart;

    public Item() {
    }

    public Item(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
