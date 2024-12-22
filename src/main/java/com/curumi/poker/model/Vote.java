package com.curumi.poker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer value;

    @ManyToOne
    private User user;

    @ManyToOne
    private Room room;
}