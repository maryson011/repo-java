import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // ler num1
        // ler num2
        // escolher + - * / %
        // usar apenas conceitos do cápitulo

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Escolha um dos operadores [+, -, *, ou /]: ");
        String op = entrada.next();

        if (op.equals("+")) {
            System.out.println(num1 + num2);
        } else if (op.equals("-")) {
            System.out.println(num1 - num2);
        } else if (op.equals("*")) {
            System.out.println(num1 * num2);
        } else if (op.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Você digitou algo errado!!!!");
        }

        entrada.close();
    }
}
