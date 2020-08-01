package com.gestaodegastos.gestaodegastoscm.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Gasto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private BigDecimal valor;

	@Column(nullable = false, columnDefinition = "datetime")
	private OffsetDateTime data;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "sistema_id", nullable = false)
	private Sistema sistema;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

}
