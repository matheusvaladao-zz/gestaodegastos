package com.gestaodegastos.gestaodegastoscm.domain.repository;

import org.springframework.stereotype.Repository;

import com.gestaodegastos.gestaodegastoscm.domain.model.Gasto;

@Repository
public interface GastoRepository extends CustomRepositoryJpa<Gasto, Long> {

}
