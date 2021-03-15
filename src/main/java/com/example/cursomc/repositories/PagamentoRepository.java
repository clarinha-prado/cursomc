package com.example.cursomc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository extends CrudRepository<Pagamento, Integer> {

}
