package com.tecnholus.testepraticobeckend.resources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecnholus.testepraticobeckend.domain.Cambio;
import com.tecnholus.testepraticobeckend.services.CambioService;

@RestController
@RequestMapping(value = "/cambios")
public class CambioResource{

	@Autowired
    private CambioService service;
	
    

	 
	 @GetMapping("/latest/")
		public ResponseEntity<List<Cambio>> getName(@RequestParam String name) {
			return new ResponseEntity<List<Cambio>>(service.findByName(name), HttpStatus.OK);
		}
	 
	// Metodo que expoe os dados do cambio por ID
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){	
    	
    	Cambio obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);	
    	
    }
    
    @RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Cambio>> findAll() {
		List<Cambio> list = service.findAll();
        return ResponseEntity.ok().body(list);
	}
}