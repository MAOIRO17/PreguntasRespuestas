package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.model.Encuesta;
import com.project.services.EncuestaService;

@RestController
@RequestMapping("/encuestas")
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService;

    @GetMapping
    public List<Encuesta> listarEncuestas() {
        return encuestaService.getAllEncuestas();
    }

    @PostMapping
    public Encuesta crearEncuesta(@RequestBody Encuesta encuesta) {
        return encuestaService.guardarEncuesta(encuesta);
    }

    @PostMapping("/votar/{idOpcion}")
    public void votar(@PathVariable Long idOpcion) {
        encuestaService.votar(idOpcion);
    }
}
