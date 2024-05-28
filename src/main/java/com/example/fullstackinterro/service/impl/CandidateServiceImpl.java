package com.example.fullstackinterro.service.impl;

import com.example.fullstackinterro.model.Candidate;
import com.example.fullstackinterro.repository.CandidateRepository;
import com.example.fullstackinterro.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate findById(Long id) {
        return candidateRepository.findById(id).orElse(null);
    }

    @Override
    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public void deleteById(Long id) {
        candidateRepository.deleteById(id);
    }
}
