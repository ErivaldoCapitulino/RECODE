package com.recode.agcap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.recode.agcap.entities.Reserva;
import com.recode.agcap.repositories.ReservaRepository;

@Service
public class ReservaService {
	@Autowired
	private ReservaRepository repository;
	
	public Page<Reserva> findReservas(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
