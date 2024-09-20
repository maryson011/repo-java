public class Produto {
    final String nome;
    final double preco;
    final double desconto;

    public Produto(double preco, String nome, double desconto) {
        this.preco = preco;
        this.nome = nome;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s tem preço de R$ %.2f", nome, preco * (1 - desconto));
    }
}
