package personalizadaA;

import main.Aluno;

public class Validar {
    private Validar() {}

    public static void usuario(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0) {
            throw new NumeroNegaticoException("nota");
        }
    }
}
