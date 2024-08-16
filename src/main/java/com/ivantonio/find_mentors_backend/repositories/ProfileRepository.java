package com.ivantonio.find_mentors_backend.repositories;

import com.ivantonio.find_mentors_backend.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
