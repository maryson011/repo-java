package com.maryson.jdbc.exercicioFixacao;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private double desconto;

    public Produto(String nome, String descricao, double preco, double desconto) {
        if (nome.length() >= 5) this.nome = nome;
        if (descricao.length() > 10) this.descricao = descricao;
        if (preco > 0) this.preco = preco;
        if (desconto > 0 && desconto < 0.8) this.desconto = desconto;
    }

    public double getPrecoComDesconto() {
        return this.preco * (1 - this.desconto);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }
}
