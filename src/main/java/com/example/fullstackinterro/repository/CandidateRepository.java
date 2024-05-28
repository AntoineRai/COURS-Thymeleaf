package com.example.fullstackinterro.repository;

import com.example.fullstackinterro.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
