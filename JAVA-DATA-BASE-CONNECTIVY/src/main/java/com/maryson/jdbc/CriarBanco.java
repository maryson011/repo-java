package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        String stringConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "rootpassword2024";

        Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_jdbc");

        System.out.println("Banco criado com sucesso!!");

        conexao.close();
    }
}
