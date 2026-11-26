package com.inspirecamp7.myspringbootproject4.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String customerId;

    private String customderName;
}
