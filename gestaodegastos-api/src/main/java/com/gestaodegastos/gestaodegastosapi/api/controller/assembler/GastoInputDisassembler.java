package com.gestaodegastos.gestaodegastosapi.api.controller.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gestaodegastos.gestaodegastosapi.api.model.input.GastoInput;
import com.gestaodegastos.gestaodegastosapi.domain.model.input.GastoModelInput;
import com.gestaodegastos.gestaodegastosapi.domain.model.input.UsuarioModelIdInput;

@Component
public class GastoInputDisassembler {

	@Autowired
	private ModelMapper modelMapper;

	public GastoModelInput toDomainObject(GastoInput gastoInput) {
		GastoModelInput gastoModelInput = modelMapper.map(gastoInput, GastoModelInput.class);

		UsuarioModelIdInput usuarioModelIdInput = new UsuarioModelIdInput();
		usuarioModelIdInput.setId(gastoInput.getCodigousuario());
		gastoModelInput.setUsuario(usuarioModelIdInput);

		return gastoModelInput;
	}

}
