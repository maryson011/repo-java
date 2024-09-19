package desafioCapitulo;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 2.29);
        Comida c2 = new Comida("Feijão", 0.900);
        Pessoa p = new Pessoa("Maria", 55.80);
        System.out.println(p.toString());
        p.comer(c1);
        p.comer(c2);
        System.out.println(p.toString());
    }
}
