package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o parâmetro para pesquisa: ");
        String parametro = entrada.nextLine();

        String sqlPesquisa = "SELECT * FROM pessoas WHERE nome LIKE ?";
        String sqlAtualiza = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        String sqlDeleta = "DELETE pessoas WHERE codigo = ?";
        Connection conn = FabricaConexao.getConexao();

        PreparedStatement stmtSCH = conn.prepareStatement(sqlPesquisa);
        stmtSCH.setString(1, "%" + parametro + "%");
        ResultSet resultado = stmtSCH.executeQuery();

        List<Pessoa> data = new ArrayList<>();
        while (resultado.next()) {
            int id = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            data.add(new Pessoa(id, nome));
        }

        System.out.println("Digite o cógigo que deseja alterar o nome: ");
        for(Pessoa d: data) {
            System.out.println(d.getCodigo() + "> " + d.getNome());
        }
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o novo nome: ");
        String novoNome = entrada.nextLine();

        PreparedStatement stmtAtualizar = conn.prepareStatement(sqlAtualiza);
        stmtAtualizar.setString(1, novoNome);
        stmtAtualizar.setInt(2, id);
        stmtAtualizar.execute();

        entrada.close();
        stmtSCH.close();
        stmtAtualizar.close();
        conn.close();

    }
}
