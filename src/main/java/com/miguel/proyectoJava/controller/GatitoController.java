package com.miguel.proyectoJava.controller;


import com.miguel.proyectoJava.entity.Gatito;
import com.miguel.proyectoJava.services.GatitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GatitoController {

    @Autowired
    GatitoService gatitoService;

    @GetMapping("/MiGato")
    public ResponseEntity<String>miGato(){
        String miGato = gatitoService.miGato();
        return ResponseEntity.ok(miGato);
    }

    @GetMapping("/Gatitos")
    public ResponseEntity<List<Gatito>>gatitos(){
        List<Gatito> listaGatitos = gatitoService.leerGatitos();
        return ResponseEntity.ok(listaGatitos);
    }

    @GetMapping("/Gatitos/{edad}")
    public ResponseEntity<List<Gatito>>gatitosPorEdad(@PathVariable Integer edad){
        List<Gatito> listaGatitos = gatitoService.leerGatitosPorEdad(edad);

        return ResponseEntity.ok(listaGatitos);
    }

    @PutMapping("/actualizarGatito/{id}")
    public ResponseEntity<Gatito> actualizarGatitos(@RequestBody Gatito gatito, @PathVariable Long id){
        Gatito gatitoActualizado = gatitoService.actualizarGatito(gatito,id);

        return ResponseEntity.ok(gatitoActualizado);
    }

    @PostMapping("/guardarGatito")
    public ResponseEntity<Gatito> guardarGatito(@RequestBody Gatito gatito){
        Gatito gatitoGuardado = gatitoService.guardarGatito(gatito);

        return ResponseEntity.ok(gatitoGuardado);

    }

    @DeleteMapping("/eliminarGatito/{id}")

    public ResponseEntity<Gatito> eliminarGatito(@PathVariable Long id) {

        Gatito gatitoGuardado = gatitoService.eliminarGatito(id);

        return ResponseEntity.ok(gatitoGuardado);

    }
}
