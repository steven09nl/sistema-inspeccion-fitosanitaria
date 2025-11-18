package com.miempresa.ica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.ica.model.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {}
