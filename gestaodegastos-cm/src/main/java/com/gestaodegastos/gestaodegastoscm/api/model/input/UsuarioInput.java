package com.gestaodegastos.gestaodegastoscm.api.model.input;

import lombok.Data;

@Data
public class UsuarioInput {

	private Long id;
	private String nome;
	private String email;
	private String senha;

}
