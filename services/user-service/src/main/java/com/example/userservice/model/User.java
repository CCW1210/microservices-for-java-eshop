﻿package com.example.userservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = \"users\")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    // getters & setters ...
}
