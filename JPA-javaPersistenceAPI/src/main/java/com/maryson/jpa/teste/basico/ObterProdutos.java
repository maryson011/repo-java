package com.maryson.jpa.teste.basico;

import com.maryson.jpa.infra.ProdutoDAO;
import com.maryson.jpa.modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for(Produto p: produtos) {
            System.out.println("ID: "+p.getId()+", Nome: "+p.getNome()+", Preço: "+p.getPreco());
        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();
        System.out.println("O valor total é: "+precoTotal);
        dao.fechar();
    }
}
