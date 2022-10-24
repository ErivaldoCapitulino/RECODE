package com.recode.agcap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agcap.entities.Destino;
import com.recode.agcap.services.DestinoService;

@RestController
@RequestMapping(value="/destinos")
public class DestinoController {
	@Autowired
	private DestinoService service;
	@GetMapping
	public Page<Destino> findDestino(Pageable pageable){
		return service.findDestino(pageable);
	}
}
