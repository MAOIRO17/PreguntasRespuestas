package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.model.Encuesta;
import com.project.model.Opcion;
import com.project.repository.EncuestaRepository;
import com.project.repository.OpcionRepository;

@Service
public class EncuestaService {
    @Autowired
    private EncuestaRepository encuestaRepository;
    @Autowired
    private OpcionRepository opcionRepository;

    public List<Encuesta> getAllEncuestas() {
        return encuestaRepository.findAll();
    }

    public Optional<Encuesta> getEncuestaById(Long id) {
        return encuestaRepository.findById(id);
    }

    public Encuesta guardarEncuesta(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

    public void votar(Long idOpcion) {
        Opcion opcion = opcionRepository.findById(idOpcion)
                .orElseThrow(() -> new RuntimeException("Opción no encontrada"));
        opcion.setVotos(opcion.getVotos() + 1);
        opcionRepository.save(opcion);
    }
}
