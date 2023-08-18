package com.ajtsistemas.syscare.domain.models;

import com.ajtsistemas.syscare.domain.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Scheduling {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private LocalDateTime dateTimeScheduling;
    private LocalDateTime dateTimeAdded;
    private Status status;
    @OneToOne
    private Doctor doctor;
}
