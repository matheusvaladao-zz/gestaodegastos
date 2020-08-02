package com.gestaodegastos.gestaodegastoscm.domain.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaodegastos.gestaodegastoscm.domain.model.Gasto;
import com.gestaodegastos.gestaodegastoscm.domain.repository.GastoRepository;

@Service
public class GastoService {

	@Autowired
	private GastoRepository gastoRepository;

	@Transactional
	public Gasto salvarGasto(Gasto gasto) {
		return gastoRepository.save(gasto);
	}

}
