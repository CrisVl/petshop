package com.petshopdemo.model;

import com.petshopdemo.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PetType extends BaseEntity implements Serializable {

    @Column(columnDefinition = "ENUM('Dog', 'Snake', 'Horse')", name = "specialities")
    private String petType;
}
