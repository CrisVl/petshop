package com.petshopdemo.model;

import com.petshopdemo.model.common.Contact;
import com.petshopdemo.model.common.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends Person implements Serializable {

    @Builder
    public Owner(Long id, Date dateOfBirth, String gender, String firstName, String lastName, String middleName, String alias, Contact contact, Set<Pet> pets) {
        super(id, dateOfBirth, gender, firstName, lastName, middleName, alias, contact);
        if(pets != null) {
            this.pets = pets;
        }
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets;
}