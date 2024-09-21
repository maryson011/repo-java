package org.example;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // double -> Double - auto box - wrapper

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Texto"); // double -> Double - auto box - wrapper

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
