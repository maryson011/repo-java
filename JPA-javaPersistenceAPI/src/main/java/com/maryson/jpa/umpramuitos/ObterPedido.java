package com.maryson.jpa.umpramuitos;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.umpramuitos.ItemPedido;
import com.maryson.jpa.modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO< Pedido> dao  = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);
        dao.fechar();

        for(ItemPedido item: pedido.getItens()) {
            System.out.println(item.getQuantidade());
        }

        //dao.fechar();
    }
}
