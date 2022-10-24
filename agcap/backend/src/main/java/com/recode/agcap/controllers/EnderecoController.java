package com.recode.agcap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agcap.entities.Endereco;
import com.recode.agcap.services.EnderecoService;

@RestController
@RequestMapping(value="/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoService service;
	@GetMapping
	public Page<Endereco> findEnderecos(Pageable pageable){
		return service.findEnderecos(pageable);
	}
}
