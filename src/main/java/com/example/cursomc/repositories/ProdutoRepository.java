package com.example.cursomc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
