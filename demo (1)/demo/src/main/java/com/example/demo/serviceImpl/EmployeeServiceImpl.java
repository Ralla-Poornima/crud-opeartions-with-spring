package com.example.demo.serviceImpl;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;
    @Override
    public String createEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Record saved with id : "+employee.getId()+"employee first name : "+employee.getFirstName();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }


    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
