package com.maryson.exerciciosmvc.model.repositories;

import com.maryson.exerciciosmvc.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
