package com.first_spring_boot.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Platform {
    @Id
    public Integer platformId;
    public String name;
}

