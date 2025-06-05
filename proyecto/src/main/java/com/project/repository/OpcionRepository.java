package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.model.Opcion;

public interface OpcionRepository extends JpaRepository<Opcion, Long> {
}
