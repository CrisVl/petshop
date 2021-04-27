package com.petshopdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vet extends Employee implements Serializable {

    /*
    To make the ID UUID as shown here https://www.wimdeblauwe.com/blog/2020/03/03/uuid-based-value-objects-with-spring-boot-rest-api/
     */
    @Column(name = "veterinary_registry_id")
    private Long veterinaryRegistryId;

    @Temporal(TemporalType.DATE)
    private Date qualificationDate;

    /*
    This annotation is for the speciality relationship
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
        inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();
}