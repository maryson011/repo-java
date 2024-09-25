package com.maryson.jdbc.exercicioFixacao;

import com.maryson.jdbc.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection conn;

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConn()
                    .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);

            if (stmt.executeUpdate() > 0) {
                ResultSet resultado = stmt.getGeneratedKeys();
                if (resultado.next()) {
                    return resultado.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConn().close();
        } catch (SQLException e) {

        } finally {
            conn = null;
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for(Object atributo: atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            } else if (atributo instanceof Double) {
                stmt.setDouble(indice, (Double) atributo);
            }
            indice++;
        }
    }

    private Connection getConn() {
        try {
            if (conn != null && !conn.isClosed()) {
                return conn;
            }
        } catch (SQLException e) {

        }
        conn = FabricaConexao.getConexao();
        return conn;
    }
}
