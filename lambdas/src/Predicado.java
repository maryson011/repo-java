import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 90;

        Produto produto = new Produto(101, "mouse", 0.1);
        System.out.println(isCaro.test(produto));
        System.out.println((produto.preco * (1 - produto.desconto)));
    }
}
