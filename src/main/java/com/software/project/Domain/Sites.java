package com.software.project.Domain;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


import javax.persistence.Entity;
@Data
@Entity

public class Sites {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String Name;//the name of the site
    private String Data;

    private  String Region;
        
}
