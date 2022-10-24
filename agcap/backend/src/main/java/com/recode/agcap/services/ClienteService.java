package com.recode.agcap.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.recode.agcap.entities.Cliente;
import com.recode.agcap.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Page<Cliente> findClientes(Pageable pageable) {
		return repository.findAll(pageable);
	}

}
