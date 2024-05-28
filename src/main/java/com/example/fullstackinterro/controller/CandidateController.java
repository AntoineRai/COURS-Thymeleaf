package com.example.fullstackinterro.controller;

import com.example.fullstackinterro.model.Candidate;
import com.example.fullstackinterro.model.Employee;
import com.example.fullstackinterro.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping()
    private String allCandidates(Model model){
        List<Candidate> candidates = candidateService.findAll();
        model.addAttribute("candidates", candidates);
        return "candidate/list";
    }

    @GetMapping("/new")
    private String newCandidates(Model model){
        model.addAttribute("candidate", new Candidate());
        return "candidate/form";
    }

    @GetMapping("/{id}")
    public String getDetailsOfEmployees(@PathVariable("id") Long id, Model model){
        Candidate candidate = candidateService.findById(id);
        model.addAttribute("candidate", candidate);
        return "candidate/view";
    }

    @GetMapping("/{id}/update")
    public String updateEmployeeForm(@PathVariable("id") Long id, Model model) {
        Candidate candidate = candidateService.findById(id);
        model.addAttribute("candidate", candidate);
        return "candidate/update";
    }

    @PostMapping()
    public String saveEmployee(@ModelAttribute Candidate candidate, BindingResult result, Model model){
        if (result.hasErrors()) {
            model.addAttribute("candidate", candidate);
            return "candidates/form";
        }
        candidateService.save(candidate);
        return "redirect:/candidates";
    }

    @PostMapping("/{id}")
    public String updateCandidate(@PathVariable("id") Long id, @ModelAttribute Candidate candidate, BindingResult result, Model model){
        if (result.hasErrors()) {
            model.addAttribute("candidate", candidate);
            return "candidates/update";
        }
        candidateService.save(candidate);
        return "redirect:/candidates";
    }
}
