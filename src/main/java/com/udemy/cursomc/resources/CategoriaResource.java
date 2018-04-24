package com.udemy.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursomc.domain.Categoria;
import com.udemy.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		// PathVariable -> linka id do metodo (parametro) com id do endpoint (value)
		// ResponseEntity<?> -> encapsula uma resposta http para o tipo rest
		//    torna generico, ao inves de retornar lista de categorias 
		
		Categoria obj = service.buscar(id);
		
		// retorna objeto buscado pelo servico
		return ResponseEntity.ok().body(obj);
	}
}
