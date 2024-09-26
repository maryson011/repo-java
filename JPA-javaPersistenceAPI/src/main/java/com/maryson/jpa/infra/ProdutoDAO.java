package com.maryson.jpa.infra;

import com.maryson.jpa.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
    public ProdutoDAO() {
        super(Produto.class);
    }
}
