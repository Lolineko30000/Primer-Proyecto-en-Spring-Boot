package com.first_spring_boot.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    public Integer genreId;
    public String genreName;
}

