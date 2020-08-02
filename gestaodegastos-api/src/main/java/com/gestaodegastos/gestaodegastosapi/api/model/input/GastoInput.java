package com.gestaodegastos.gestaodegastosapi.api.model.input;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class GastoInput {

	private String descricao;
	private BigDecimal valor;
	private Long codigousuario;
	private OffsetDateTime data;

}
