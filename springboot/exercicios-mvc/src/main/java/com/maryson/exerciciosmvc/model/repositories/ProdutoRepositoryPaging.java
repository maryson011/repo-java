package com.maryson.exerciciosmvc.model.repositories;

import com.maryson.exerciciosmvc.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepositoryPaging extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
    // deve seguir a converção do padrão spring boot

    // findByNomeContaining
    // findByNomeIsContaining
    // findByNomeContains

    // findByNomeStartsWith
    // findByNomeEndWith

    // findByNomeNotContaining
    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
