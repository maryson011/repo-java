package com.maryson.jpa.modelo.basico;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produtos", schema = "curso_java_jdbc")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "prod_nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "prod_preco", nullable = false)
    private Double preco;

    public Produto() {}

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
