package com.gestaodegastos.gestaodegastosapi.domain.service;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestaodegastos.gestaodegastosapi.api.model.input.GastoInput;
import com.gestaodegastos.gestaodegastosapi.core.queue.QueueProperties;
import com.gestaodegastos.gestaodegastosapi.domain.model.input.GastoModelInput;
import com.gestaodegastos.gestaodegastosapi.domain.model.output.GastoModelOutput;

@Service
public class GastoService {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
	QueueProperties queueProperties;

	@Autowired
	ObjectMapper mapper;

	public GastoInput obterGasto(Long id) {
		return null;
	}

	public List<GastoInput> listarGastos() {
		return null;
	}

	public List<GastoInput> listarGastosPorData(OffsetDateTime data) {
		return null;
	}

	public GastoModelOutput salvarGasto(GastoModelInput gastoModelInput) {
		try {
			String replyMessage = (String) rabbitTemplate.convertSendAndReceive(queueProperties.cadastrarGasto,
					mapper.writeValueAsString(gastoModelInput));
			GastoModelOutput gastoModelOutput = mapper.readValue(replyMessage, GastoModelOutput.class);
			return gastoModelOutput;

		} catch (Exception e) {
			return null;
		}
	}

	public GastoInput alterarGasto(Long id, GastoInput gasto) {
		return null;
	}
}
