package com.example.fullstackinterro.controller;

import com.example.fullstackinterro.model.Candidate;
import com.example.fullstackinterro.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping
    private String allCandidates(Model model){
        List<Candidate> candidates = candidateService.findAll();
        model.addAttribute("candidates", candidates);
        return "candidate/list";
    }
}
