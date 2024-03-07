package com.miguel.proyectoJava.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaProperties {
    @Value("${frase.gatito}")
    private String fraseDelGatito;

    private String fraseDelGatito2;



    @GetMapping("/MiGatito")
    public ResponseEntity<String> miGatito() {

        return ResponseEntity.ok(fraseDelGatito);

    }

    @GetMapping("/Miau")
    public ResponseEntity<String> maullido(){
        fraseDelGatito2 = "miaaau";
        return ResponseEntity.ok(fraseDelGatito2);
    }
}
