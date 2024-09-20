import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p1 = new Produto(200, "iPad", 0.1);

        /*
        * 1 - A partir do produto calcular o preco real (com desconto)
        * 2 - Imposto Municipal: >= 2500 (8.5%) / < 2500 (isento)
        * 3 - Frete: >= 3000 (0%)/ < 3000 (5%)
        * 4 - Arredondar: Deixar duas casas decimais
        * 5 - Formatar: R$0000,00
        * */

        Function<Produto, Double> comDesconto = p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal = v -> v >= 90 ? v * (1 + 0.085) : v;
        UnaryOperator<Double> frete = v -> v >= 200 ? v : v * (1 + 0.05);
        Function<Double, String> arredonda = v -> String.format("%.2f",v); // Double.parseDouble(String.format("%.2f",v))
        UnaryOperator<String> formatado = s -> "R$ "+ s;

        String valorP1 = comDesconto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredonda)
                .andThen(formatado)
                .apply(p1);

        System.out.println(valorP1);
    }
}
