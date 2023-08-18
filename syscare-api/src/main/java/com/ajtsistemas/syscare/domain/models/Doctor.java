package com.ajtsistemas.syscare.domain.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String specialty;
    @OneToMany
    private List<HealthCenter> healthCenter;
}
