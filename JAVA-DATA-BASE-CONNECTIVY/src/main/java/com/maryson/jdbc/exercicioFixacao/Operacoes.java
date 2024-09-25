package com.maryson.jdbc.exercicioFixacao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Operacoes {

    static DAOExercico dao = new DAOExercico();

    public void criar(Produto produto) {
        String sql = "INSERT INTO produtos (nome, descricao, preco, desconto) VALUES (?, ?, ?, ?)";
        dao.incluir(sql, produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getDesconto());
    }

    public void atualizar(String parametro, Double preco) {
        String sql = "UPDATE produtos SET preco = ? WHERE nome = ?";
        dao.incluir(sql, preco, parametro);
    }

    public List<Produto> listar() {
        String sql = "SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<>();
        ResultSet rs = dao.consultar(sql);
        try {
            while (rs.next()) {
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                Double preco = rs.getDouble("preco");
                Double desconto = rs.getDouble("desconto");
                Produto produto = new Produto(nome, descricao, preco, desconto);
                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public void deletar(String parametro) {
        String sql = "DELETE FROM produtos WHERE nome = ?";
        dao.incluir(sql, parametro);
    }
}
