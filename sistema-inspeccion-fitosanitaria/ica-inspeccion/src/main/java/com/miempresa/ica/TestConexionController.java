package com.miempresa.ica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConexionController {

    @GetMapping("/test-conexion")
    public String testConexion() {
        return "El backend está conectado correctamente a Oracle.";
    }
}
