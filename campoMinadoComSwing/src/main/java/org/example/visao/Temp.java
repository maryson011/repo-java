package org.example.visao;

import org.example.modelo.Tabuleiro;

public class Temp {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(3,3,9);
        tab.registrarObservador(e -> {
            if (e.isGanhou()) {
                System.out.println("ganhou!!! :)");
            } else {
                System.out.println("Perdeu play boy");
            }
        });
        tab.alternarMarcacao(0,0);
        tab.alternarMarcacao(0,1);
        tab.alternarMarcacao(0,2);
        tab.alternarMarcacao(1,0);
        tab.alternarMarcacao(1,1);
        tab.alternarMarcacao(1,2);
        tab.alternarMarcacao(2,0);
        tab.alternarMarcacao(2,1);
        tab.abrir(2,2);
        //tab.alternarMarcacao(2,2);
    }
}
