package com.example.gestionservices.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TypeService {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String nomType;

}
