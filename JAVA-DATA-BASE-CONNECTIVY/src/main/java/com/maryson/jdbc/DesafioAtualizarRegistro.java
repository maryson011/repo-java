package com.maryson.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
    private static Connection conn;
    private static String sqlPesquisa = "SELECT * FROM pessoas WHERE nome LIKE ?";
    private static String sqlAtualiza = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
    private static String sqlDeleta = "DELETE from pessoas WHERE codigo = ?";

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o parâmetro para pesquisa: ");
        String parametro = entrada.nextLine();

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

        System.out.println("Deseja alterar um registro ou deletar? Digite [atualizar ou Deletar]");
        String operacao = entrada.nextLine();
        if ("atualizar".equalsIgnoreCase(operacao)) {
            atualizarRegistro(conn, data);
        } else if ("deletar".equalsIgnoreCase(operacao)){
            deletarRegistro(conn, data);
        }

        entrada.close();
        stmtSCH.close();
        conn.close();

    }

    private static void deletarRegistro(Connection conn, List<Pessoa> data) {
        System.out.println("Qual registro deseja alterar? Digite o id: ");
        for(Pessoa d: data) {
            System.out.println(d.getCodigo() + ": " + d.getNome());
        }
        Scanner entrada = new Scanner(System.in);
        int id = entrada.nextInt();
        entrada.nextLine();

        try {
            PreparedStatement stmtDeletar = conn.prepareStatement(sqlDeleta);
            stmtDeletar.setInt(1, id);
            stmtDeletar.execute();
            stmtDeletar.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void atualizarRegistro(Connection conn, List<Pessoa> data) {
        System.out.println("Digite o cógigo que deseja alterar o nome: ");
        for(Pessoa d: data) {
            System.out.println(d.getCodigo() + ": " + d.getNome());
        }
        Scanner entrada = new Scanner(System.in);
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o novo nome: ");
        String novoNome = entrada.nextLine();

        try {
            PreparedStatement stmtAtualizar = conn.prepareStatement(sqlAtualiza);
            stmtAtualizar.setString(1, novoNome);
            stmtAtualizar.setInt(2, id);
            stmtAtualizar.execute();
            stmtAtualizar.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
