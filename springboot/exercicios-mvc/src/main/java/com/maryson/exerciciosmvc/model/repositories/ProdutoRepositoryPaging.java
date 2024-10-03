package com.maryson.exerciciosmvc.model.repositories;

import com.maryson.exerciciosmvc.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepositoryPaging extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
    // deve seguir a converção do padrão spring boot
}
