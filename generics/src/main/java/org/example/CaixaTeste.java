package org.example;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Caixa");
        System.out.println(caixaA.abrir());

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaD = new Caixa<>();
        caixaD.guardar(23.21);

        Double coisaD = caixaD.abrir();
        System.out.println(coisaD);
    }
}
