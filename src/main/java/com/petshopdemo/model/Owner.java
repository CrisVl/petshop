package com.petshopdemo.model;

import com.petshopdemo.model.common.Contact;
import com.petshopdemo.model.common.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@Builder
public class Owner extends Person implements Serializable {
}