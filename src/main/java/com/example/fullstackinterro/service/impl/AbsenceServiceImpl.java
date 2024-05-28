package com.example.fullstackinterro.service.impl;

import com.example.fullstackinterro.model.Absence;
import com.example.fullstackinterro.repository.AbsenceRepository;
import com.example.fullstackinterro.service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    @Override
    public List<Absence> findAll() {
        return absenceRepository.findAll();
    }

    @Override
    public Absence findById(Long id) {
        return absenceRepository.findById(id).orElse(null);
    }

    @Override
    public Absence save(Absence absence) {
        return absenceRepository.save(absence);
    }

    @Override
    public void deleteById(Long id) {
        absenceRepository.deleteById(id);
    }
}
