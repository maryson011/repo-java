public class Produto {
    private final String nome;
    private final double preco;
    private final double desconto;
    static private final double descontoPadrao = 0.1;

    public Produto(String nome, double preco, double desconto) {
        if (desconto > 0.8 || desconto < 0.1) {
            this.desconto = descontoPadrao;
        } else {
            this.desconto = desconto;
        }
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return this.nome;
    }

    public double getDesconto() {
        return this.preco * (1 - this.desconto);
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.getDesconto();
    }
}
