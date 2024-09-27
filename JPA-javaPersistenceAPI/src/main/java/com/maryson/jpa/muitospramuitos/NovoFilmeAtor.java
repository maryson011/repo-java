package com.maryson.jpa.muitospramuitos;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.muitospramuitos.Ator;
import com.maryson.jpa.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filmeA = new Filme("Star Wars Ep4", 8.7);
        Filme filmeB = new Filme("O Fugitivo", 8.1);

        Ator atorA = new Ator("Harrison Ford");
        Ator atorB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atorB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeA);
        dao.fechar();
    }
}
