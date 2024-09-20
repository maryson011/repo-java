import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(41));

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resuldadoFinal = parOuImpar
                .andThen(oResultadoE) // "O resultado é: valor
                .andThen(empolgado) // "valor !!!
                .apply(33);

        System.out.println(resuldadoFinal);
    }
}
