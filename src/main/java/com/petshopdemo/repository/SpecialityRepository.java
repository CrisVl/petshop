package com.petshopdemo.repository;

import com.petshopdemo.model.Employee;
import com.petshopdemo.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
