package com.petshopdemo.model;

import com.petshopdemo.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "specialities")
public class Speciality extends BaseEntity implements Serializable {
    @Column(columnDefinition = "ENUM('CARDIOLOGY', 'DENTISTRY', 'NUTRITIONIST')", name = "specialities")
    private String specialities;
}
