package com.petshopdemo.model;


import com.petshopdemo.model.common.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.petshopdemo.model.common.Contact;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person implements Serializable {

    @Temporal(TemporalType.DATE)
    private Date employmentDate;
    private BigDecimal salary;

}
