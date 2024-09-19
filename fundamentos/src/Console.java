import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Int: %d %d %d %d%n", 1,2,3,4);
        System.out.printf("Doubles: %.1f %.2f %.3f %f", 1.1,2.43,3.111,4.0);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);

        entrada.close();
    }
}
