package com.gestaodegastos.gestaodegastoscm.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QueueProperties {

	@Value("${fila.listarGastos}")
	public String listarGastos;

}
