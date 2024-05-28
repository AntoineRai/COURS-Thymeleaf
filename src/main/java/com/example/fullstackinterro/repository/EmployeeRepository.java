package com.example.fullstackinterro.repository;

import com.example.fullstackinterro.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
