package com.first_spring_boot.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    public Integer genreId;
    public String genreName;
}

