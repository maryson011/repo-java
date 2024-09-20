package main;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirAluno(a1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Fim");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
