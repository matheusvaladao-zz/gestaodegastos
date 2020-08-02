package com.gestaodegastos.gestaodegastoscm.api.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestaodegastos.gestaodegastoscm.api.model.input.GastoInput;
import com.gestaodegastos.gestaodegastoscm.api.model.output.CategoriaOutput;
import com.gestaodegastos.gestaodegastoscm.api.model.output.GastoOutput;
import com.gestaodegastos.gestaodegastoscm.api.model.output.SistemaOutput;
import com.gestaodegastos.gestaodegastoscm.api.model.output.UsuarioOutput;

@Component
public class GastoListener {

	@Autowired
	ObjectMapper mapper;

	@RabbitListener(queues = "${fila.cadastrarGasto}")
	public String cadastrarGasto(@Payload String mensagem) {
		try {
			GastoInput gastoInput = mapper.readValue(mensagem, GastoInput.class);

			GastoOutput gastoOutput = new GastoOutput();
			gastoOutput.setId(1L);
			gastoOutput.setDescricao(gastoInput.getDescricao());
			gastoOutput.setData(gastoInput.getData());
			gastoOutput.setValor(gastoInput.getValor());

			CategoriaOutput categoriaOutput = new CategoriaOutput();
			categoriaOutput.setId(1L);
			categoriaOutput.setDescricao(gastoInput.getDescricao());
			gastoOutput.setCategoria(categoriaOutput);

			UsuarioOutput usuarioOutput = new UsuarioOutput();
			usuarioOutput.setId(gastoInput.getUsuario().getId());
			gastoOutput.setUsuario(usuarioOutput);

			SistemaOutput sistemaOutput = new SistemaOutput();
			sistemaOutput.setId(gastoInput.getSistema().getId());
			gastoOutput.setSistema(sistemaOutput);

			return mapper.writeValueAsString(gastoOutput);
		} catch (Exception e) {
			return null;
		}
	}

}
