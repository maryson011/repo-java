import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "João", "Gui", "Ian");

        System.out.println(umLista.get());
    }
}
