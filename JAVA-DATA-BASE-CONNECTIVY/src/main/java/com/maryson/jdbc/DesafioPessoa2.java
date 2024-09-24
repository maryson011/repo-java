package com.maryson.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioPessoa2 {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o parametro para pesquisa: ");
        String params = entrada.nextLine();
        entrada.close();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
        Connection conn = FabricaConexao.getConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + params + "%");
        ResultSet resposta = stmt.executeQuery();

        List<Pessoa> data = new ArrayList<>();
        while(resposta.next()) {
            int condigo = resposta.getInt("codigo");
            String nome = resposta.getString("nome");
            data.add(new Pessoa(condigo, nome));
        }

        stmt.close();
        conn.close();

        for(Pessoa d: data) {
            System.out.println("Condigo: " + d.getCodigo() + " Nome: " + d.getNome());
        }
    }
}
