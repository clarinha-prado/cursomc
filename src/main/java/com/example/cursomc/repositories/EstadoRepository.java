package com.example.cursomc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Integer> {

}
