package com.ivantonio.find_mentors_backend.repositories;

import com.ivantonio.find_mentors_backend.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
