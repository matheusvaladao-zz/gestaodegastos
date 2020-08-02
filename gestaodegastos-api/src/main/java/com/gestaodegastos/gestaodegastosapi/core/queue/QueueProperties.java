package com.gestaodegastos.gestaodegastosapi.core.queue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QueueProperties {

	@Value("${fila.cadastrarGasto}")
	public String cadastrarGasto;

	@Value("${fila.obterGasto}")
	public String obterGasto;

	@Value("${fila.listarGastos}")
	public String listarGastos;

	@Value("${fila.listarCategorias}")
	public String listarCategorias;

}
