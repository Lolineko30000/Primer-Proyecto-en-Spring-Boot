package com.first_spring_boot.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Saga {
    @Id
    public Integer sagaId;
    @ManyToOne
    public Producer producer;
    public String name;
    public Date date;
}
