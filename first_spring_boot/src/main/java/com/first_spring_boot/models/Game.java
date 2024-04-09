package com.first_spring_boot.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Game {
    @Id
    public Integer gameId;
    @ManyToOne
    public Saga saga;
    public String title;
    public Float price;
    public Date releaseDate;
    public String description;
    public String imageUrl;
    public String classification;
    public Float score;
}
