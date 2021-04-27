package com.petshopdemo.model.common;

import com.petshopdemo.model.Employee;
import lombok.Data;
import lombok.Setter;

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
}
