package com.maryson.jpa.muitospramuitos;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.muitospramuitos.Sobrinho;
import com.maryson.jpa.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args) {
        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");

        Sobrinho sob1 = new Sobrinho("Guilherme");
        Sobrinho sob2 = new Sobrinho("Heloisa");

        tia1.getSobrinhos().add(sob1);
        sob1.getTios().add(tia1);
        tia1.getSobrinhos().add(sob2);
        sob2.getTios().add(tia1);

        tio2.getSobrinhos().add(sob1);
        sob1.getTios().add(tio2);
        tio2.getSobrinhos().add(sob2);
        sob2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();
        dao.abrirTransacao()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sob1)
                .incluir(sob2)
                .fecharTransacao()
                .fechar();

    }
}
