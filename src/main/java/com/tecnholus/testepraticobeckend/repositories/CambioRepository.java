package com.tecnholus.testepraticobeckend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnholus.testepraticobeckend.domain.Cambio;

@Repository
public interface CambioRepository  extends JpaRepository<Cambio, Integer>{

	List<Cambio> findByName(String name);
}
