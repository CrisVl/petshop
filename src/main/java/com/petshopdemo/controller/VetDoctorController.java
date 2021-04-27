package com.petshopdemo.controller;

import com.petshopdemo.model.Owner;
import com.petshopdemo.model.Vet;
import com.petshopdemo.services.OwnerService;
import com.petshopdemo.services.VetDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/v1/veterinaryDoctors")

public class VetDoctorController {
    private final VetDoctorService vetDoctorService;

    @Autowired
    public VetDoctorController(VetDoctorService vetDoctorService) {
        this.vetDoctorService = vetDoctorService;
    }

    @GetMapping(value = "/all")
    public List<Vet> getAll() {
        return vetDoctorService.returnAll();
    }

    @PostMapping(value = "/new")
    public Vet persist(@RequestBody final Vet vetDoctor) {
        return vetDoctorService.saveVetDoctor(vetDoctor);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Vet> getVeByID(@PathVariable Long id) {
        return new ResponseEntity<>(vetDoctorService.findById(id), HttpStatus.OK);
    }
}
