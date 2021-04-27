package com.petshopdemo.controller;

import com.petshopdemo.model.Speciality;
import com.petshopdemo.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/speciality")
public class SpecialityController {

    private final SpecialityService specialityService;

    @Autowired
    public SpecialityController(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Speciality> getVeByID(@PathVariable Long id) {
        return new ResponseEntity<>(specialityService.findById(id), HttpStatus.OK);
    }
}
