package com.maryson.exerciciosmvc.model.repositories;

import com.maryson.exerciciosmvc.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepositoryPaging extends PagingAndSortingRepository<Produto, Integer> {
}
