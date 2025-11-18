package com.miempresa.ica.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.miempresa.ica.model.*;
import com.miempresa.ica.repository.*;

@RestController
@RequestMapping("/api/catalogos")
public class CatalogoController {
    @Autowired private LugarRepository lugarRepo;
    @Autowired private LoteRepository loteRepo;
    @Autowired private EspecieRepository especieRepo;
    @Autowired private PlagaRepository plagaRepo;

    @GetMapping("/lugares/byPredio/{predioId}")
    public List<LugarProduccion> lugaresByPredio(@PathVariable Long predioId){
        return lugarRepo.findByIdPredio(predioId);
    }

    @GetMapping("/lotes/byLugar/{lugarId}")
    public List<Lote> lotesByLugar(@PathVariable Long lugarId){
        return loteRepo.findByIdLugar(lugarId);
    }

    @GetMapping("/lotes/{id}")
    public Lote getLote(@PathVariable Long id){ return loteRepo.findById(id).orElse(null); }

    @GetMapping("/especies")
    public List<Especie> especies(){ return especieRepo.findAll(); }

    @GetMapping("/plagas")
    public List<Plaga> plagas(){ return plagaRepo.findAll(); }
}
