package com.petshopdemo.controller;


import com.petshopdemo.model.Owner;
import com.petshopdemo.model.Pet;
import com.petshopdemo.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/pet")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }


    @GetMapping(value = "/all")
    public List<Pet> getAll() {
        return petService.returnAll();
    }

    @PostMapping(value = "/new")
    public Pet persist(@RequestBody final Pet pet) {
        return petService.savePet(pet);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Pet> getVeByID(@PathVariable Long id) {
        return new ResponseEntity<>(petService.findById(id), HttpStatus.OK);
    }

}
