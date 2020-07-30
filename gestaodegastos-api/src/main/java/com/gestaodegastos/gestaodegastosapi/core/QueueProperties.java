package com.gestaodegastos.gestaodegastosapi.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QueueProperties {

	@Value("${fila.listar-gastos}")
	public String listarGastos;

}
