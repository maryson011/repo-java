package personalizadaA;

import main.Aluno;

public class TesteValidações {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Maria", -2);
            Validar.usuario(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroNegaticoException e) {
            System.out.println(e.getMessage());
        }
    }
}
