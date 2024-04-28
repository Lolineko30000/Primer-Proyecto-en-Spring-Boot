package com.first_spring_boot.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
    @Id
    public Integer languageId;
    public String languageName;
}
