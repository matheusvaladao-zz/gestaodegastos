package com.gestaodegastos.gestaodegastoscm.domain.repository;

import org.springframework.stereotype.Repository;

import com.gestaodegastos.gestaodegastoscm.domain.model.Categoria;

@Repository
public interface CategoriaRepository extends CustomRepositoryJpa<Categoria, Long> {

}
