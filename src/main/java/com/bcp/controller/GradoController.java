package com.bcp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.entity.Grado;
import com.bcp.service.GradoService;

@RestController
@RequestMapping("/api/rest/grado/")
public class GradoController {
	
	@Autowired
	private GradoService service;
	
	@GetMapping
	public ResponseEntity<List<Grado>> lista(){
		return ResponseEntity.ok(service.listaGrado());
	}

	@PostMapping
	public ResponseEntity<Grado> inserta(@RequestBody Grado obj){
		return ResponseEntity.ok(service.insertaActualizaGrado(obj));
	}
	
	@PutMapping
	public ResponseEntity<Grado> actualiza(@RequestBody Grado obj){
		return ResponseEntity.ok(service.insertaActualizaGrado(obj));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> elimina(@PathVariable int id){
		Optional<Grado> obj = service.buscaGradoPorId(id);
		if(obj.isPresent()) {
			service.eliminaGradoPorId(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
}



