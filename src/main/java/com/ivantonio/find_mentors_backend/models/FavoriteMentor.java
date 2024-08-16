package com.ivantonio.find_mentors_backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FavoriteMentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private User mentor;
}
