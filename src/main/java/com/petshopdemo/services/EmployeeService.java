package com.petshopdemo.services;

import com.petshopdemo.model.Employee;
import com.petshopdemo.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.petshopdemo.repository.EmployeeRepository;

import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository veterinaryDoctorRepository) {
        this.employeeRepository = veterinaryDoctorRepository;
    }

    public List<Employee> returnAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
