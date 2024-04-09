package com.first_spring_boot.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Match {
    @Id
    public Integer gameId;
    @ManyToOne
    public User user;
    public Date startDate;
    public Date endDate;
    public boolean online;
}
