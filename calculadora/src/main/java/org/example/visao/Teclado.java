package org.example.visao;

import javax.swing.*;
import java.awt.*;

public class Teclado extends JPanel {
    private final Color CINZA_ESCURO = new Color(68,68,68);
    private final Color CINZA_CLARO = new Color(99,99,99);
    private final Color LARANJA = new Color(242,163,60);
    public Teclado() {
        setLayout(new GridLayout(5,4));
        add(new Botao("AC", CINZA_ESCURO));
        add(new Botao("+/-", CINZA_ESCURO));
        add(new Botao("%", CINZA_ESCURO));
        add(new Botao("/", LARANJA));

        add(new Botao("7", CINZA_ESCURO));
        add(new Botao("8", CINZA_ESCURO));
        add(new Botao("9", CINZA_ESCURO));
        add(new Botao("*", LARANJA));

        add(new Botao("4", CINZA_ESCURO));
        add(new Botao("5", CINZA_ESCURO));
        add(new Botao("6", CINZA_ESCURO));
        add(new Botao("-", LARANJA));

        add(new Botao("1", CINZA_ESCURO));
        add(new Botao("2", CINZA_ESCURO));
        add(new Botao("3", CINZA_ESCURO));
        add(new Botao("+", LARANJA));

        add(new Botao("0", CINZA_ESCURO));
        add(new Botao(",", CINZA_ESCURO));
        add(new Botao(".", CINZA_ESCURO));
        add(new Botao("=", LARANJA));
    }
}
