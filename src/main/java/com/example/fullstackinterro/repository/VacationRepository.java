package com.example.fullstackinterro.repository;

import com.example.fullstackinterro.model.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation,Long> {
}
