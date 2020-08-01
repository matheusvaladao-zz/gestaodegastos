package com.gestaodegastos.gestaodegastoscm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomRepositoryJpa<T, ID> extends JpaRepository<T, ID> {

}
