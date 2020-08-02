package com.gestaodegastos.gestaodegastosapi.api.controller;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gestaodegastos.gestaodegastosapi.api.controller.assembler.GastoInputDisassembler;
import com.gestaodegastos.gestaodegastosapi.api.model.input.GastoInput;
import com.gestaodegastos.gestaodegastosapi.domain.model.input.GastoModelInput;
import com.gestaodegastos.gestaodegastosapi.domain.model.input.SistemaModelIdInput;
import com.gestaodegastos.gestaodegastosapi.domain.model.output.GastoModelOutput;
import com.gestaodegastos.gestaodegastosapi.domain.service.GastoService;

@RestController
@RequestMapping("/gastos")
public class GastoController {

	@Autowired
	GastoService gastoService;

	@Autowired
	GastoInputDisassembler gastoInputDisassembler;

	@GetMapping("/{id}")
	public GastoInput obterGasto(@PathVariable Long id) {
		return gastoService.obterGasto(id);
	}

	@GetMapping
	public List<GastoInput> listarGastos() {
		return gastoService.listarGastos();
	}

	@GetMapping("/{dataString}")
	public List<GastoInput> listarGastosPorData(@PathVariable String dataString) {
		OffsetDateTime data = OffsetDateTime.now();
		return gastoService.listarGastosPorData(data);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public GastoModelOutput cadastrarGasto(@RequestBody GastoInput gastoInput) {
		GastoModelInput gastoModelInput = gastoInputDisassembler.toDomainObject(gastoInput);
		SistemaModelIdInput sistema = new SistemaModelIdInput();
		sistema.setId(1L);
		gastoModelInput.setSistema(sistema);
		return gastoService.salvarGasto(gastoModelInput);
	}

}
