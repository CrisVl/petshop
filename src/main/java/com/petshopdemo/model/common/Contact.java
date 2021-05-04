package com.petshopdemo.model.common;

import com.petshopdemo.model.Employee;
import com.petshopdemo.model.Owner;
import com.petshopdemo.model.Vet;
import lombok.Data;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Data
@Setter
@Entity

public class Contact extends BaseEntity {
    private String emailAddress;
    private String mobileTelNo;
    private String homeTelNo;
    private String workTelNo;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Owner owner;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Vet vet;
}
