package com.maryson.jpa.heranca;

import com.maryson.jpa.infra.DAO;
import com.maryson.jpa.modelo.heranca.Aluno;
import com.maryson.jpa.modelo.heranca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {
        DAO< Aluno> alunoDAO = new DAO<>();

        Aluno aluno = new Aluno(123L, "Joõ");
        AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Maria", 1200);

        alunoDAO.incluirAtomico(aluno);
        alunoDAO.incluirAtomico(alunoBolsista);

        alunoDAO.fechar();
    }
}
