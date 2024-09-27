package com.maryson.jpa.umpraum;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.umpraum.Assento;
import com.maryson.jpa.modelo.umpraum.Cliente;

public class NovoClienteAssentoDois {
    public static void main(String[] args) {
        Assento assento = new Assento("4D");
        Cliente client = new Cliente("Roberto", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(client).fechar();
    }
}
