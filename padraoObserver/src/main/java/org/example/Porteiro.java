package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    private List<ObservadorChegadaAniversariante> observadores
            = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante o) {
        observadores.add(o);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!"Sair".equalsIgnoreCase(valor)) {
            System.out.println("Aniversaiante chegou? ");
            valor = entrada.nextLine();

            if ("Sim".equalsIgnoreCase(valor)) {
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                valor = "Sair";
            } else {
                System.out.println("Alarme falso!!");
            }
        }

        entrada.close();
    }
}
