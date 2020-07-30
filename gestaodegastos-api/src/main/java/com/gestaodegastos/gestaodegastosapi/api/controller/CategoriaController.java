package com.gestaodegastos.gestaodegastosapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaodegastos.gestaodegastosapi.api.model.Categoria;
import com.gestaodegastos.gestaodegastosapi.domain.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/sugestoes/{texto}")
	public List<Categoria> listarSugestoesDeCategorias(String texto) {
		return categoriaService.listarSugestoesDeCategorias(texto);
	}

}
