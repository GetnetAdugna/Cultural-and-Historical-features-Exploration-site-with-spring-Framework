package com.software.project.Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Content{

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;
        private String title;//the name of the History
        @Lob
        private String content;
        private  String location;
        @Lob
        private byte[] imgData;
        private String yearElapsed;
        private String contentType;
        
}
    