package com.gestaodegastos.gestaodegastosapi.domain.service;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaodegastos.gestaodegastosapi.api.model.Gasto;
import com.gestaodegastos.gestaodegastosapi.core.QueueProperties;

@Service
public class GastoService {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
	QueueProperties queueProperties;

	public Gasto obterGasto(Long id) {
		return null;
	}

	public List<Gasto> listarGastos() {
		rabbitTemplate.convertAndSend(queueProperties.listarGastos, "Teste");
		return null;
	}

	public List<Gasto> listarGastosPorData(OffsetDateTime data) {
		return null;
	}

	public Gasto salvarGasto(Gasto gasto) {
		return null;
	}

	public Gasto alterarGasto(Long id, Gasto gasto) {
		return null;
	}
}
