public class Operadores {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 - 2);
        System.out.println(2 / 2);
        System.out.println(2 % 2 > 0);

        // Unários
        int a = 1;
        int b = 2;
        System.out.println(a++ > 1); // false
        System.out.println(++a > 1); // false
        System.out.println(b++);
        System.out.println(b);

        // Ternario
        double media = 5.5;
        String resultado =  media >= 6.5 ? "aprovado" : "reprovado";
        System.out.println(resultado);
    }
}
