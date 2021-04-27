package com.petshopdemo.services;

import com.petshopdemo.model.Employee;
import com.petshopdemo.model.Owner;
import com.petshopdemo.model.Vet;
import com.petshopdemo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Autowired
    public List<Owner> returnAll() {
        return ownerRepository.findAll();
    }

    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

}
