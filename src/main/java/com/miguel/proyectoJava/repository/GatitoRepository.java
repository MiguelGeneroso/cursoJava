package com.miguel.proyectoJava.repository;

import com.miguel.proyectoJava.entity.Gatito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GatitoRepository extends JpaRepository<Gatito,Long> {

    @Query("SELECT g FROM Gatito g WHERE g.edad >= :edad")
    List<Gatito> findByEdad(@Param("edad") int edad);
}
