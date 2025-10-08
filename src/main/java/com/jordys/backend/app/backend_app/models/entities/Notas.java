package com.jordys.backend.app.backend_app.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notas {
 @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
}
