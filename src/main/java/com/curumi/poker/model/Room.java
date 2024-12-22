package com.curumi.poker.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private User creator;

    @OneToMany(mappedBy = "room")
    private List<Vote> votes;
}