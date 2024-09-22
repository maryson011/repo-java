package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // centralizar no centro

        JButton botao = new JButton("Clicar");
        janela.add(botao);

//        botao.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Evento ocorreu!!");
//            }
//        });
        botao.addActionListener(e -> {
            Date data = new Date();
            System.out.println("Evento ocorreu!!!" + data);
        });

        janela.setVisible(true);
    }
}
