import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu sálario: ");
        String salario = entrada.nextLine();

        Double salarioAumento = Double.parseDouble(salario) * (1 + 0.1);
        System.out.println(salarioAumento);

        System.out.print("Informe o primeiro sálario: ");
        String valor1 = entrada.next().replace(",", ".");

        System.out.print("\nInforme o segundo sálario: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.print("\nInforme o terceiro sálario: ");
        String valor3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.printf("A média dos três sálario é %.2f", media);


        entrada.close();
    }
}
