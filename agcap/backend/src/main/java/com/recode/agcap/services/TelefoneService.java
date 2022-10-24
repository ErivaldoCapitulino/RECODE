package com.recode.agcap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.recode.agcap.entities.Telefone;
import com.recode.agcap.repositories.TelefoneRepository;

@Service
public class TelefoneService {
		@Autowired
		private TelefoneRepository repository;
		
		public Page<Telefone> findTelefones(Pageable pageable) {
			return repository.findAll(pageable);
		}
}
