package com.example.demo.service;
import com.example.demo.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    public String createEmployee(Employee employee);
public Optional<Employee> getEmployeeById(int id);


}
