package com.software.project.Domain;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
@Data
@Entity

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String username;
    
    private String firstName;
    private String lastName;
    private String Email;

 

}
