package com.maryson.jdbc.exercicioFixacao;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> operacoes = new HashSet<>();
        operacoes.add("Criar");
        operacoes.add("Atualizar");
        operacoes.add("Deletar");

        boolean continuar = true;
        while (continuar) {
            System.out.println("==============================");
            int i = 1;
            for(String ope: operacoes) {
                System.out.println(i + ": " + ope);
                i++;
            }
            System.out.println("Qual operação deseja executar?");
            Integer valor = entrada.nextInt();
            entrada.nextLine();

            if (valor == 3) {
                criarProduto();
            } else if (valor == 1) {
                atualizarProduto();
            } else if (valor == 2) {
                deletarProduto();
            } else {
                System.out.println("Operação inválida!!!!!");
                continuar = false;
            }

            System.out.println("Deseja continuar? (S/n)");
            String desejaContinuar = entrada.nextLine();
            if ("S".equalsIgnoreCase(desejaContinuar)) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
        System.out.println("Programa finalizado!");
        entrada.close();
    }

    private static void deletarProduto() {
        listaProdutos();
        System.out.println("Qual o nome do produto?");
        String parametro = entrada.nextLine();

        o.deletar(parametro);
    }

    private static void listaProdutos() {
        List<Produto> produtos = o.listar();
        System.out.println("-----------------------------------------");
        for(Produto produto: produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preco: " + produto.getPreco());
            System.out.println("Desconto: " + produto.getDesconto());
            System.out.println("Preço com desconto: " + produto.getPrecoComDesconto());
            System.out.println("-----------------------------------------");
        }
    }

    static Operacoes o = new Operacoes();
    private static void atualizarProduto() {
        listaProdutos();
        System.out.println("Qual o nome do produto?");
        String parametro = entrada.nextLine();

        System.out.println("Qual o novo preço?");
        Double preco = entrada.nextDouble();
        entrada.nextLine();

        o.atualizar(parametro, preco);
    }

    private static void criarProduto() {
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Descrição: ");
        String descricao = entrada.nextLine();
        System.out.println("Preço: ");
        Double preco = entrada.nextDouble();
        System.out.println("Desconto: ");
        Double desconto = entrada.nextDouble();
        entrada.nextLine();

        Produto p = new Produto(nome, descricao, preco, desconto);

        Operacoes o = new Operacoes();
        o.criar(p);
    }
}
