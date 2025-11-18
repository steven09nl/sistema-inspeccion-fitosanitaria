package com.miempresa.ica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.miempresa.ica.model.Lote;

public interface LoteRepository extends JpaRepository<Lote, Long> {
    List<Lote> findByIdLugar(Long idLugar);
}
