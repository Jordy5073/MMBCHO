package com.jordys.backend.app.backend_app.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Matricula_e_c")
public class Matricula_e_c {
 @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
}
