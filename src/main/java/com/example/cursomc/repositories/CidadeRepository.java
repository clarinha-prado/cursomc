package com.example.cursomc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Integer> {

}
