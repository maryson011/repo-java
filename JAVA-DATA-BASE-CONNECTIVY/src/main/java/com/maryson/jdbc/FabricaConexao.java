package com.maryson.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
    public static Connection getConexao() {
        try {
            Properties prop = getProperties();
            //String url = "jdbc:mysql://localhost:3306/curso_java_jdbc?verifyServerCertificate=false&useSSL=true";
            String url = prop.getProperty("banco.url");
            String usuario = prop.getProperty("banco.usuario");
            String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

        // trocando uma exeção checada por uma não checada
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String currentUserHomeDir = System.getProperty("user.home");
        System.out.println(currentUserHomeDir);
        String path = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(path));
        return prop;
    }
}
