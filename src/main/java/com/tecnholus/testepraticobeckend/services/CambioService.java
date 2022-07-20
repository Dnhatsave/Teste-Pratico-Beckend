package com.tecnholus.testepraticobeckend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnholus.testepraticobeckend.domain.Cambio;
import com.tecnholus.testepraticobeckend.repositories.CambioRepository;

@Service
public class CambioService {

	@Autowired
	private CambioRepository repo;
	
	public Cambio buscar(Integer id) {
		Optional<Cambio> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Cambio> findAll(){
		return repo.findAll();
	}
	
	public List<Cambio> findByName(String name) {
		return repo.findByName(name);
	}
}
