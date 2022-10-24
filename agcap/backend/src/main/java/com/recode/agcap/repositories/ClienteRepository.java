package com.recode.agcap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.agcap.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
}

