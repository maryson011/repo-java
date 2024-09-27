package com.maryson.jpa.modelo.composicao;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String logradouro;

    private String complementos;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplementos() {
        return complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }
}
