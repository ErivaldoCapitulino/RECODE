package com.recode.agcap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agcap.entities.Reserva;
import com.recode.agcap.services.ReservaService;

@RestController
@RequestMapping(value="reservas")
public class ReservaController {

	@Autowired
	private ReservaService service;
	@GetMapping
	public Page<Reserva> findReservas(Pageable pageable){
		return service.findReservas(pageable);
	}
}
