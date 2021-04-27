package com.petshopdemo.repository;

import com.petshopdemo.model.Owner;

import com.petshopdemo.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VetDoctorRepository extends JpaRepository<Vet, Long> {
}
