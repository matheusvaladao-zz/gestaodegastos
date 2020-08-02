package com.gestaodegastos.gestaodegastosapi.domain.model.output;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class GastoModelOutput {

	private Long id;

	private String descricao;

	private BigDecimal valor;

	private OffsetDateTime data;

	private UsuarioModelOutput usuario;

	private SistemaModelOutput sistema;

	private CategoriaModelOutput categoria;

}
