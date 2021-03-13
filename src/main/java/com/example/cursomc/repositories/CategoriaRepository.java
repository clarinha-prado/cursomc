package com.example.cursomc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

}
