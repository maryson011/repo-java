package org.example;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicinar(1, "Maria");
        resultadoConcurso.adicinar(2, "Ian");
        System.out.println(resultadoConcurso.getValor(2));
        resultadoConcurso.adicinar(3, "Davi");
        resultadoConcurso.adicinar(4, "Ana");
        resultadoConcurso.adicinar(2, "Ricardo");
        resultadoConcurso.adicinar(6, "Leandro");

        System.out.println(resultadoConcurso.getValor(2));
    }
}
