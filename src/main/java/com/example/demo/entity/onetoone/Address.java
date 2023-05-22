package com.example.demo.entity.onetoone;

import com.example.demo.entity.onetomany.Item;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String street;

    private String city;

    @OneToOne(mappedBy = "address")
    @JsonBackReference
    private People people;

    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }
}
