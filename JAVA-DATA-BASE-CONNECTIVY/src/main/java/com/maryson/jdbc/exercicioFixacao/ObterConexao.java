package com.maryson.jdbc.exercicioFixacao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ObterConexao {
    public static Connection getConexao() {
        try {
            Properties pro = getProperties();
            String url = pro.getProperty("banco.url");
            String usuario = pro.getProperty("banco.usuario");
            String senha = pro.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties properties = new Properties();
        String path = "/conexao.properties";
        properties.load(ObterConexao.class.getResourceAsStream(path));
        return properties;
    }
}
