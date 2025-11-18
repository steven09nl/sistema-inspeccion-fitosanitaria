package com.miempresa.ica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.miempresa.ica.model.LugarProduccion;

public interface LugarRepository extends JpaRepository<LugarProduccion, Long> {
    List<LugarProduccion> findByIdPredio(Long idPredio);
}
