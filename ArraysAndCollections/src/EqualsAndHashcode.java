import java.util.*;

public class EqualsAndHashcode {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        Usuario u1 = new Usuario("João Batista");
        u1.nome = "João Batista";
        u1.email = "batista@email.com";

        Usuario u2 = new Usuario("João Batista");
        u2.nome = "João Batista";
        u2.email = "batista@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        // Collections
        // Set:     não ordenado, não indexado, não aceita repetição
        // List:    indexada, aceita repetição
        // Map:     chave/valor, chave não aceita repetição, valor aceita repetição
        // Queue:   implementa fila, first in/first out (FIFO)
        // Stack:   implementa pilha (stack), lat in/first out (LIFO)

        // Set: pode ser heterogêneo, pode set homogênio, não aceita obj. duplicado, pode ser ordenado, não é indexado
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(3);
        conjunto.add("x");
        System.out.println(conjunto);
        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("x"));
        System.out.println(conjunto);
        System.out.println(conjunto.contains(1.2));
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        conjunto.addAll(nums); // união dos conjuntos
        System.out.println(conjunto);
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        Set<String> lista = new HashSet<>();
        lista.add("Maryson");
        lista.add("João");
        lista.add("Maria");
        lista.add("Luana");
        System.out.println(lista);

        for(String candidato: lista) {
            System.out.println(candidato);
        }
        // Ordenados
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Pedro");
        listaAprovados.add("Rita");
        listaAprovados.add("Heloisa");
        System.out.println(listaAprovados);

        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        // List: pode ser heterogêneo, pode ser homogênio, aceita obj. duplicado, é ordenado, é indexado
        ArrayList<Usuario> listaU = new ArrayList<>();
        listaU.add(new Usuario("João Batista"));
        listaU.add(new Usuario("Cintia"));
        listaU.add(new Usuario("Carol"));
        listaU.add(new Usuario("Antonio"));

        System.out.println(listaU.get(2));

        for(Usuario user: listaU) {
            System.out.println(user);
        }

        listaU.remove(1);
        for(Usuario user: listaU) {
            System.out.println(user);
        }

        // Queue: Fila
        Queue<String> fila = new LinkedList<>();
        fila.add("Tais");
        // Offer e Add -> a diferença é o comportamento quando a fila está cheia
        fila.offer("Bia");
        fila.offer("Crlos");
        fila.offer("Rafaela");
        fila.offer("Gui");
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // Map
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberta");
        usuarios.put(2, "Carla");
        usuarios.put(3, "Rafaela");
        usuarios.put(1, "Carlos");

        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Carla"));
        System.out.println(usuarios.get(1));

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey() + "===>" + registro.getValue());
        }

        // Hash
        HashSet<Usuario> usuarios1 = new HashSet<>();
        usuarios1.add(new Usuario("Pedro"));
        usuarios1.add(new Usuario("Ricardo"));
        usuarios1.add(new Usuario("Antonio"));

        boolean resultado = usuarios1.contains(new Usuario("Antonio"));
        System.out.println(resultado);
    }
}
