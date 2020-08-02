package com.gestaodegastos.gestaodegastoscm.api.model.output;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class GastoOutput {

	private Long id;

	private String descricao;

	private BigDecimal valor;

	private OffsetDateTime data;

	private UsuarioOutput usuario;

	private SistemaOutput sistema;

	private CategoriaOutput categoria;

}
