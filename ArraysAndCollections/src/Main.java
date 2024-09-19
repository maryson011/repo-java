import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        double[] a = new double[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(Arrays.toString(a));

        double total = 0;
        for(int i = 0; i < a.length; i++) {
             total += a[i];
        }

        System.out.println(total /  a.length);

        for(double i: a){
            System.out.println(i);
        }

        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[5];
        try {
            System.out.println("Informe a primeira nota: ");
            notas[0] = entrada.nextDouble();
            System.out.println("Informe a segunda nota: ");
            notas[1] = entrada.nextDouble();
            System.out.println("Informe a terceira nota: ");
            notas[2] = entrada.nextDouble();
            System.out.println("Informe a quarta nota: ");
            notas[3] = entrada.nextDouble();
            System.out.println("Informe a quinta nota: ");
            notas[4] = entrada.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira um número válido. Use vírgula (,) como separador decimal");
        } finally {
            entrada.close();
        }

        System.out.println(Arrays.toString(notas));

        double totalNotas = 0;
        for(double nota: notas) {
            totalNotas += nota;
        }

        double media = totalNotas / notas.length;
        System.out.printf("A média do aluno é %.2f ", media);
    }
}