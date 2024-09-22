package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        porteiro.registrarObservador(namorada);

        porteiro.registrarObservador(e -> {
            System.out.println("Surpresa via lambda!!!");
            System.out.println("Horário de chegada " + e.getMomento());
        });

        porteiro.monitorar();
    }
}