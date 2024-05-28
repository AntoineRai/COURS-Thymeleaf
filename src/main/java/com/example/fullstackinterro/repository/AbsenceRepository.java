package com.example.fullstackinterro.repository;

import com.example.fullstackinterro.model.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsenceRepository extends JpaRepository<Absence,Long> {
}
