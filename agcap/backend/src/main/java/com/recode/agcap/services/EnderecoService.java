package com.recode.agcap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.recode.agcap.entities.Endereco;
import com.recode.agcap.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	public Page<Endereco> findEnderecos(Pageable pageable) {
		return repository.findAll(pageable);
	}

}
