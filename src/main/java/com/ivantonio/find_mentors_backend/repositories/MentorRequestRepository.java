package com.ivantonio.find_mentors_backend.repositories;

import com.ivantonio.find_mentors_backend.models.MentorRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRequestRepository extends JpaRepository<MentorRequest, Long> {
}
