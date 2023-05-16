package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeServiceImpl employeeService;
    @PostMapping("/createEmp")
    public String createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return "Record created with id :"+employee.getId();
    }
    @GetMapping("/getAllEmp")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/getEmpById/{id}")
    public Optional<Employee> getEmpById(@PathVariable int id){
      return employeeService.getEmployeeById(id);
    }

}
