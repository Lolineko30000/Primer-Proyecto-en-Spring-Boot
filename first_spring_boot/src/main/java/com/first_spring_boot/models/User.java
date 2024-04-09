package com.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    public Integer userId;
    public String name;
    public Float walletBalance;
    public String email;
    public String phoneNumber;
}
