package com.example.fullstackinterro.controller;

import com.example.fullstackinterro.service.CandidateService;
import com.example.fullstackinterro.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("candidates", candidateService.findAll().size());
        model.addAttribute("employees", employeeService.findAll().size());
        return "home/index";
    }
}
