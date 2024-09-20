import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ian", "Davi");
        System.out.println("Usando foreach");
        for ( String nome: aprovados) {
            System.out.println(nome);
        }
        aprovados.forEach(System.out::println);

        System.out.println("\nUsando interaror...");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsando stream...");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
