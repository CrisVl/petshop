package com.petshopdemo.model;

import com.petshopdemo.model.common.BaseEntity;
import com.petshopdemo.model.common.PersonalInformation;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Pet extends PersonalInformation implements Serializable {

    @Builder
    public Pet(Long id, Date dateOfBirth, String gender, PetType petType, Owner owner) {
        super(id, dateOfBirth, gender);
        this.petType = petType;
        this.owner = owner;
    }

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
