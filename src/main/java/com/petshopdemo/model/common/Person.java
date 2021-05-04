package com.petshopdemo.model.common;

import com.petshopdemo.model.common.PersonalInformation;
import lombok.*;



import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Person extends PersonalInformation implements Serializable {

    public Person(Long id, Date dateOfBirth, String gender, String firstName, String lastName, String middleName, String alias, Contact contact) {
        super(id, dateOfBirth, gender);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.alias = alias;
        this.contact = contact;
    }

    private String firstName;
    private String lastName;
    private String middleName;
    private String alias;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;

}
