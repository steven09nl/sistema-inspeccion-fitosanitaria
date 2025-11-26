package com.miempresa.ica.controller;

import com.miempresa.ica.model.Inspeccion;
import com.miempresa.ica.service.InspeccionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inspecciones")
@CrossOrigin("*")
public class InspeccionController {

    private final InspeccionService service;

    public InspeccionController(InspeccionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Inspeccion> listar() {
        return service.listar();
    }

    @PostMapping
    public Inspeccion crear(@RequestBody Inspeccion i) {
        return service.guardar(i);
    }

    @GetMapping("/{id}")
    public Inspeccion buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Inspeccion actualizar(@PathVariable Long id, @RequestBody Inspeccion i) {
        i.setId(id);
        return service.guardar(i);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
