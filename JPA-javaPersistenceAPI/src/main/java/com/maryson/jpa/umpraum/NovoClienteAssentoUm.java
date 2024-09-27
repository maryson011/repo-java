package com.maryson.jpa.umpraum;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.umpraum.Assento;
import com.maryson.jpa.modelo.umpraum.Cliente;

public class NovoClienteAssentoUm {
    public static void main(String[] args) {
        Assento assento = new Assento("4E");
        Cliente cliente = new Cliente("Luana", assento);

        DAO<Object> dao = new DAO<>();
        //dao.incluirAtomico(assento).fechar(); isso da erro
        //dao.incluirAtomico(cliente).fechar();
        dao.abrirTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fechar();
    }
}
