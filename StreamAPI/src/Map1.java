import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map1 {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("bmw ", "audi ", "honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        //UnaryOperator<String> grito = n -> n + "!!!";

        maiuscula.andThen(primeiraLetra).apply("nmw");

        System.out.println("\n\nUsando composição!!!");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

    }
}
