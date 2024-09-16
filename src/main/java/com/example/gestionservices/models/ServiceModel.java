package com.example.gestionservices.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ServiceModel")
public class ServiceModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int id ;
   private float prix;
   private Date dateService;
   private String adresseService;
    @ManyToOne
    @JoinColumn(name="nomService",nullable=false)
    private TypeService typeService;


}
