package com.miempresa.ica.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.miempresa.ica.service.InformeService;
import com.miempresa.ica.model.Informe;

@RestController
@RequestMapping("/api/informes")
public class InformeController {
    @Autowired private InformeService service;
    @GetMapping
    public List<Informe> list(){ return service.listAll(); }
    @GetMapping("/{id}")
    public ResponseEntity<Informe> get(@PathVariable Long id){
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Informe> create(@RequestBody Informe informe){
        Informe saved = service.save(informe);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Informe> update(@PathVariable Long id, @RequestBody Informe informe){
        if(!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        informe.setIdInforme(id);
        return ResponseEntity.ok(service.save(informe));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
