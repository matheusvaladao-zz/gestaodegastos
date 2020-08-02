package com.gestaodegastos.gestaodegastoscm.api.model.input;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class GastoInput {

	private String descricao;
	private BigDecimal valor;
	private UsuarioIdInput usuario;
	private SistemaIdInput sistema;
	private OffsetDateTime data;

}
