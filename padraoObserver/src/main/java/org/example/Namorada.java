package org.example;

public class Namorada implements ObservadorChegadaAniversariante {
    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os comvidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("e... Surpresa!!!!!");
    }
}
