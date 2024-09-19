package desafioCapitulo;

public class Pessoa {
    String nome;
    double peso;
    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }
    @Override
    public String toString() {
        return "Olá, eu sou " + this.nome + " e tenho " + this.peso + "kg.";
    }
}
