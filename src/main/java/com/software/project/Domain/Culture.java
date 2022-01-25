package com.software.project.Domain;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
@Data
@Entity

public class Culture {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;// by using region number
    private String Name;//the name of the culture
    private String Data;

    private  String Region;
    
    
}
