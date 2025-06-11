package com.project.model;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pregunta;
    
    @OneToMany(mappedBy = "encuesta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Opcion> opciones;

}
