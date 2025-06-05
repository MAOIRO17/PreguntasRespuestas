package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.model.Encuesta;

public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {
}
