package com.lot.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
//@DiscriminatorValue("Truck")
public class Truck extends Vehicle{

    private boolean is4wd;
}
