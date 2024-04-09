package com.first_spring_boot.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Library {
    @Id
    public Integer gameId;
    @ManyToOne
    public User user;
    public Integer acquisitionMode;
    public Date acquisitionDate;
    public Float discount;
    public Float purchasePrice;
}
