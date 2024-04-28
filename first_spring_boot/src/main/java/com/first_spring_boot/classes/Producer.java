package com.first_spring_boot.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producer {
    @Id
    public Integer producerId;
    public String name;
}