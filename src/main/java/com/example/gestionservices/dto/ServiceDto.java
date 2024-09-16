package com.example.gestionservices.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class ServiceDto {
    private int id ;
    private float prix;
    private Date dateService;
    private String adresseService;
    private int idType;
}
