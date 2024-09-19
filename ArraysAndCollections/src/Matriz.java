import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();
        System.out.println("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++) {
            for(int b = 0; b < notasDaTurma[a].length; b++) {
                System.out.printf("Informe a nota %d do aluno %d: ", b+1, a+1);
                notasDaTurma[a][b] = entrada.nextDouble();
                total += notasDaTurma[a][b];
            }
        }

        entrada.close();

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.printf("Média da turma é %.2f", media);

    }
}
