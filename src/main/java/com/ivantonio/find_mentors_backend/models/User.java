package com.ivantonio.find_mentors_backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "user_app")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles role;

    private String avatar;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "student")
    private Set<MentorRequest> mentorRequestsAsStudent;

    @OneToMany(mappedBy = "mentor")
    private Set<MentorRequest> mentorRequestsAsMentor;

    @OneToMany(mappedBy = "student")
    private Set<FavoriteMentor> favoriteMentors;

    @OneToMany(mappedBy = "student")
    private Set<Session> sessionsAsStudent;

    @OneToMany(mappedBy = "mentor")
    private Set<Session> sessionsAsMentor;

    @OneToMany(mappedBy = "complainant")
    private Set<Complain> complainsAsComplainants;

    @OneToMany(mappedBy = "target")
    private Set<Complain> complainsAsTarget;

    @OneToMany(mappedBy = "resolvedBy")
    private Set<Complain> adminComplaints;

    @OneToOne
    @JoinColumn(name = "mentor_application_id")
    private MentorApplication mentorApplication;

    @OneToMany(mappedBy = "reviewedBy")
    private Set<MentorApplication> adminApplications;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}
