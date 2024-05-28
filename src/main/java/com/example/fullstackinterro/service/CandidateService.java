package com.example.fullstackinterro.service;

import com.example.fullstackinterro.model.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> findAll();

    Candidate findById(Long id);

    Candidate save(Candidate candidate);

    void deleteById(Long id);
}
