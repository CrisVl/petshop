package com.petshopdemo.repository;

import com.petshopdemo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}

