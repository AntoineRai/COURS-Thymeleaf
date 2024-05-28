package com.example.fullstackinterro.service;

import com.example.fullstackinterro.model.Vacation;

import java.util.List;

public interface VacationService {
    List<Vacation> findAll();

    Vacation findById(Long id);

    Vacation save(Vacation vacation);

    void deleteById(Long id);
}
