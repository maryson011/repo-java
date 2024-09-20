import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + " - " + (p.preco * (1 - p.desconto)));

        Produto novoProd = new Produto(200, "cANETA", 0.6);
        imprimir.accept(novoProd);

        Produto p1 = new Produto(40, "Luiz", 0.2);
        Produto p2 = new Produto(220, "Alicate", 0.1);
        Produto p3 = new Produto(90, "Martelo", 0.3);
        Produto p4 = new Produto(300, "Cerrote", 0.2);
        Produto p5 = new Produto(500, "Escada", 0.19);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
