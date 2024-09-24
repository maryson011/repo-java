package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conn = FabricaConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                +"codigo INT AUTO_INCREMENT PRIMARY KEY,"
                +"nome VARCHAR(80) NOT NULL"
                +")";

        Statement stmt = conn.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conn.close();
    }
}
