package com.gestaodegastos.gestaodegastosapi.domain.model.input;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class GastoModelInput {

	private String descricao;
	private BigDecimal valor;
	private UsuarioModelIdInput usuario;
	private SistemaModelIdInput sistema;
	private OffsetDateTime data;

}
