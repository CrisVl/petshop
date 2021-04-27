package com.petshopdemo.controller;

import com.petshopdemo.model.Employee;
import com.petshopdemo.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.petshopdemo.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService veterinaryDoctorService) {
        this.employeeService = veterinaryDoctorService;
    }

    @GetMapping(value = "/all")
    public List<Employee> getAll() {
        return employeeService.returnAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Employee> getVeByID(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }
}
