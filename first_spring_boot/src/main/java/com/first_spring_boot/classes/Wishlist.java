package com.first_spring_boot.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Wishlist {
    @Id
    public Integer gameId;
    @ManyToOne
    public User user;
    public Date dateAdded;
}

