package org.example;

import org.example.modelo.Tabuleiro;
import org.example.visao.TabuleiroConsole;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Campo Minado===");

        Tabuleiro tabuleiro = new Tabuleiro(6,6,2);
        new TabuleiroConsole(tabuleiro);

//        tabuleiro.abrir(3,3);
//        tabuleiro.alternarMarcacao(4,4);
//        tabuleiro.alternarMarcacao(4,5);
//
//        System.out.println(tabuleiro);
    }
}