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

    private String firstName;
    private String lastName;
    private String middleName;
    private String alias;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;

}
