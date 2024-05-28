package com.example.fullstackinterro.service;

import com.example.fullstackinterro.model.Absence;

import java.util.List;

public interface AbsenceService {
    List<Absence> findAll();

    Absence findById(Long id);

    Absence save(Absence absence);

    void deleteById(Long id);
}
