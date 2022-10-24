package com.recode.agcap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agcap.entities.Pacote;
import com.recode.agcap.services.PacoteService;

@RestController
@RequestMapping(value="/pacotes")
public class ClienteController {
	
	@Autowired
	private PacoteService service;
	@GetMapping
	public Page<Pacote> findPacotes(Pageable pageable){
		return service.findPacotes(pageable);
	}
}
