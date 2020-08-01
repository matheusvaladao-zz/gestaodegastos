package com.gestaodegastos.gestaodegastoscm.domain.repository;

import org.springframework.stereotype.Repository;

import com.gestaodegastos.gestaodegastoscm.domain.model.Usuario;

@Repository
public interface UsuarioRepository extends CustomRepositoryJpa<Usuario, Long> {

}
