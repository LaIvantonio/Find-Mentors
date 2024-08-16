package com.ivantonio.find_mentors_backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Complain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "complainant_id")
    private User complainant;

    @ManyToOne
    @JoinColumn(name = "target_id")
    private User target;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private ComplainStatus status;

    @ManyToOne
    @JoinColumn(name = "resolved_by_id")
    private User resolvedBy;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}
