package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informa o nome: ");
        String nome = entrada.nextLine();
        entrada.close();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        Connection conn = FabricaConexao.getConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, 10);
        stmt.execute();
        conn.close();
    }
}
