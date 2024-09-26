package com.maryson.jpa.teste.basico;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.basico.Produto;

import java.util.ArrayList;
import java.util.List;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 7000.45);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Mesa", 345.90));
        produtos.add(new Produto("Cadeira", 345.90));
        produtos.add(new Produto("Lápis", 5.90));
        produtos.add(new Produto("TV", 3345.90));
        produtos.add(new Produto("Sofa", 1345.90));

        DAO<Produto> dao = new DAO<>(Produto.class);
        //dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();
        //dao.incluirAtomico(produto).fechar();
        for(Produto prod: produtos) {
            dao.incluirAtomico(prod);
        }
        dao.fechar();

    }
}
