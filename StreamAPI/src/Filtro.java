import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 8.5);
        Aluno a2 = new Aluno("Marcia", 4.5);
        Aluno a3 = new Aluno("Luana", 7.5);
        Aluno a4 = new Aluno("Heloiza", 5.5);
        Aluno a5 = new Aluno("AnLaticia", 3.5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> estaAprovado = a -> a.nota >= 6;

        alunos.stream()
                //.filter(a -> a.nota >=6)
                .filter(estaAprovado)
                .map(a -> "Parabéns " + a.nome + "! Você foi aprovado!")
                .forEach(System.out::println);

    }
}
