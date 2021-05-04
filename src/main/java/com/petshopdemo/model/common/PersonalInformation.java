package com.petshopdemo.model.common;

import lombok.*;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class PersonalInformation extends BaseEntity {

    public PersonalInformation(Long id, Date dateOfBirth, String gender) {
        super(id);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String gender;
}
