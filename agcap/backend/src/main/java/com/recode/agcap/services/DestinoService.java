package com.recode.agcap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.recode.agcap.entities.Destino;
import com.recode.agcap.repositories.DestinoRepository;

@Service
public class DestinoService {

	@Autowired
	private DestinoRepository repository;
	
	public Page<Destino> findDestino(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
