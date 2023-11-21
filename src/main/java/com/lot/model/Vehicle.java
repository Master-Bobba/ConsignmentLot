package com.lot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "Vehicle Type")
@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;

    private String make;

    @ManyToMany
    private List<Owner> owners;


}
