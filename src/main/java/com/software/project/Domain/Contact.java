package com.software.project.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity

public class Contact {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;// by using region number
    private String Name;//the name of the culture
    private String Data;

    
}
