package com.first_spring_boot.first_spring_boot.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
    @Id
    public Integer languageId;
    public String languageName;
}
