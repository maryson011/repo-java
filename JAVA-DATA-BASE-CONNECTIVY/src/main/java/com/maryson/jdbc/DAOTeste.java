package com.maryson.jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        System.out.println(dao.incluir(sql, "João Marcos"));
        System.out.println(dao.incluir(sql, "Dijalma Pereira"));
        System.out.println(dao.incluir(sql, "Iam Silva"));

        dao.close();
    }
}
