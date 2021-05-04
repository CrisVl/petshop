package com.petshopdemo.controller;

import com.petshopdemo.model.Owner;
import com.petshopdemo.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/owners")
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = "/all")
    public List<Owner> getAll() {
        return ownerService.returnAll();
    }

    @PostMapping(value = "/new")
    public Owner persist(@RequestBody final Owner owner) {
        return ownerService.saveOwner(owner);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Owner> getVeByID(@PathVariable Long id) {
        return new ResponseEntity<>(ownerService.findById(id), HttpStatus.OK);
    }
}
