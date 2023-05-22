package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "new")
public class NewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column(columnDefinition = "TEXT")
    private String thumbnail;
    @Column
    private String shortDescription;
    @Column
    private String content;
}
