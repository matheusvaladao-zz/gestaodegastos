package com.gestaodegastos.gestaodegastoscm.domain.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class GastoService {

	@RabbitListener(queues = "${fila.listarGastos}")
	public void receive(@Payload String fileBody) {
		System.out.println("Comunicação feita: " +fileBody);
	}

}
