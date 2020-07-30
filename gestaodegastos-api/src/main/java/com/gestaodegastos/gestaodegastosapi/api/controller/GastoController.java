package com.gestaodegastos.gestaodegastosapi.api.controller;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gestaodegastos.gestaodegastosapi.api.model.Gasto;
import com.gestaodegastos.gestaodegastosapi.domain.service.GastoService;

@RestController
@RequestMapping("/gastos")
public class GastoController {

	@Autowired
	GastoService gastoService;

	@GetMapping("/{id}")
	public Gasto obterGasto(@PathVariable Long id) {
		return gastoService.obterGasto(id);
	}

	@GetMapping
	public List<Gasto> listarGastos() {
		return gastoService.listarGastos();
	}

	@GetMapping("/{dataString}")
	public List<Gasto> listarGastosPorData(@PathVariable String dataString) {
		OffsetDateTime data = OffsetDateTime.now();
		return gastoService.listarGastosPorData(data);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Gasto cadastrarGasto(@RequestBody Gasto gasto) {
		return gastoService.salvarGasto(gasto);
	}

	@PutMapping("/{id}")
	public Gasto alterarGasto(@PathVariable Long id, @RequestBody Gasto gasto) {
		return gastoService.alterarGasto(id, gasto);
	}

}
