package com.example.fullstackinterro.service.impl;

import com.example.fullstackinterro.model.Vacation;
import com.example.fullstackinterro.repository.VacationRepository;
import com.example.fullstackinterro.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationServiceImpl implements VacationService {

    @Autowired
    private VacationRepository vacationRepository;

    @Override
    public List<Vacation> findAll() {
        return vacationRepository.findAll();
    }

    @Override
    public Vacation findById(Long id) {
        return vacationRepository.findById(id).orElse(null);
    }

    @Override
    public Vacation save(Vacation vacation) {
        return vacationRepository.save(vacation);
    }

    @Override
    public void deleteById(Long id) {
        vacationRepository.deleteById(id);
    }
}
