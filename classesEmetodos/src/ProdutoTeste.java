import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse", 30.49, 0.2);
        System.out.println(p1.getNome());
        System.out.println(p1.getDesconto());
        System.out.println(p1.toString());
    }
}
