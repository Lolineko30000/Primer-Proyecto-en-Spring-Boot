package com.first_spring_boot.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

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
