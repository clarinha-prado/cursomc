package com.example.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository rep;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElse(null);
	}
	
	public Iterable<Categoria> buscarTodos() {
		Iterable<Categoria> lista = rep.findAll();
		return lista;
	}
}
