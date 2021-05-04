package com.petshopdemo.services;

import com.petshopdemo.model.Pet;
import com.petshopdemo.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> returnAll() {
        return petRepository.findAll();
    }

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }
}
