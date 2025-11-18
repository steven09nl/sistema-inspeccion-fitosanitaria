package com.miempresa.ica.service;

import org.springframework.stereotype.Service;
import com.miempresa.ica.repository.InformeRepository;
import com.miempresa.ica.repository.DetallePlagaRepository;
import com.miempresa.ica.model.Informe;
import com.miempresa.ica.model.DetallePlaga;
import java.util.List;
import java.util.Optional;

@Service
public class InformeService {
    private final InformeRepository informeRepo;
    private final DetallePlagaRepository detalleRepo;
    public InformeService(InformeRepository informeRepo, DetallePlagaRepository detalleRepo){
        this.informeRepo = informeRepo;
        this.detalleRepo = detalleRepo;
    }
    public Informe save(Informe inf){
        Informe saved = informeRepo.save(inf);
        if(inf.getDetalles()!=null){
            for(DetallePlaga d: inf.getDetalles()){
                d.setIdInforme(saved.getIdInforme());
                detalleRepo.save(d);
            }
        }
        return saved;
    }
    public List<Informe> listAll(){ return informeRepo.findAll(); }
    public Optional<Informe> findById(Long id){ return informeRepo.findById(id); }
    public void delete(Long id){ informeRepo.deleteById(id); }
}
