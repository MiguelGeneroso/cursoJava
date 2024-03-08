package com.miguel.proyectoJava.repository;

import com.miguel.proyectoJava.entity.Gatito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GatitoRepository extends JpaRepository<Gatito,Long> {
}
