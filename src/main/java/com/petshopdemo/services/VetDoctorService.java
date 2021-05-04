package com.petshopdemo.services;

import com.petshopdemo.model.Owner;
import com.petshopdemo.model.Vet;
import com.petshopdemo.repository.VetDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VetDoctorService {
    private final VetDoctorRepository vetDoctorRepository;

    @Autowired
    public VetDoctorService(VetDoctorRepository vetDoctorRepository) {
        this.vetDoctorRepository = vetDoctorRepository;
    }

    public List<Vet> returnAll() {
        return vetDoctorRepository.findAll();
    }

    public Vet saveVetDoctor(Vet vetDoctor) {
        return vetDoctorRepository.save(vetDoctor);
    }

    public Vet findById(Long id) {
        return vetDoctorRepository.findById(id).orElse(null);
    }
}
