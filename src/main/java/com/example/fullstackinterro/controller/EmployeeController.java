package com.example.fullstackinterro.controller;

import com.example.fullstackinterro.model.Employee;
import com.example.fullstackinterro.model.Vacation;
import com.example.fullstackinterro.service.AbsenceService;
import com.example.fullstackinterro.service.EmployeeService;
import com.example.fullstackinterro.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AbsenceService absenceService;

    @Autowired
    private VacationService vacationService;

    @GetMapping()
    public String allEmployees(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employee/list";
    }

    @GetMapping("/new")
    public String newEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/form";
    }

    @GetMapping("/{id}")
    public String getDetailsOfEmployees(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/view";
    }

    @GetMapping("/{id}/update")
    public String updateEmployeeForm(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/update";
    }

    @PostMapping()
    public String saveEmployee(@ModelAttribute Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("employee", employee);
            return "employee/form";
        }
        employeeService.save(employee);
        return "redirect:/employees";
    }

    @PostMapping("/{id}")
    public String updateEmployee(@ModelAttribute Employee employee, @PathVariable("id") Long id, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("employee", employee);
            return "employee/update";
        }
        employeeService.save(employee);
        return "redirect:/employees";
    }
}
