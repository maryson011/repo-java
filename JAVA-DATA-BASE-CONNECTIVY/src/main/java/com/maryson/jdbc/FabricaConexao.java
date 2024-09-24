package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    public static Connection getConexao() {
        try {
            String url = "jdbc:mysql://localhost:3306/curso_java_jdbc?verifyServerCertificate=false&useSSL=true";
            String usuario = "root";
            String senha = "rootpassword2024";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // trocando uma exeção checada por uma não checada
    }
}
