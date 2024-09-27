package com.maryson.jpa.umpramuitos;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.basico.Produto;
import com.maryson.jpa.modelo.umpramuitos.ItemPedido;
import com.maryson.jpa.modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geadeira", 2349.90);
        ItemPedido item = new ItemPedido(pedido, produto, 2);

        dao
                .abrirTransacao()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharTransacao()
                .fechar();
    }
}
