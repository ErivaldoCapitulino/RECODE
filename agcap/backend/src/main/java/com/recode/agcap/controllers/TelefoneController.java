package com.recode.agcap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agcap.entities.Telefone;
import com.recode.agcap.services.TelefoneService;

@RestController
@RequestMapping(value="/telefones")
public class TelefoneController {
	@Autowired
	private TelefoneService service;
	@GetMapping
	public Page<Telefone> findTelefones(Pageable pageable){
		return service.findTelefones(pageable);
	}
}
