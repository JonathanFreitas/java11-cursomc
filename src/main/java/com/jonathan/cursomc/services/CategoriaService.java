package com.jonathan.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.cursomc.domain.Categoria;
import com.jonathan.cursomc.repositories.CategoriaRepository;
import com.jonathan.cursomc.services.exceptions.ObjectNotFoundExcepton;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundExcepton(
				"Obj nao encontrado! Id: "+id+", Tipo: "+Categoria.class.getName()));
	}
	
}
