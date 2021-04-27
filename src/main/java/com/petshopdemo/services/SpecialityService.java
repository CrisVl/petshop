package com.petshopdemo.services;

import com.petshopdemo.model.Owner;
import com.petshopdemo.model.Speciality;
import com.petshopdemo.repository.OwnerRepository;
import com.petshopdemo.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpecialityService {
    private final SpecialityRepository ownerRepository;

    @Autowired
    public SpecialityService(SpecialityRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Speciality> returnAll() {
        return ownerRepository.findAll();
    }

    public Speciality findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }
}
