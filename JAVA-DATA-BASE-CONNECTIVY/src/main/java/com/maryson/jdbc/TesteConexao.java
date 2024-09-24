package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String stringConexao = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "rootpassword2024";

        Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);

        System.out.println("Conexão executada com sucesso!");

        conexao.close();
    }
}
