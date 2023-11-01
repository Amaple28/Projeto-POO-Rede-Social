package com.facebook.ui;

import com.facebook.dominio.RedeSocial;

import java.util.Scanner;

public class RedeSocialUI {
    private static final Scanner console = new Scanner(System.in);
    private static final RedeSocial redeSocial = new RedeSocial();

    public static void main(String[] args) {
        while(true) {
            System.out.println("Escolha uma das opçoes:");
            System.out.println("\tCriar conta [c]");
            System.out.println("\tSair [s]");

            var opcao = console.nextLine();

            if(opcao.equalsIgnoreCase("c")) {
                criarConta();
            } else if(opcao.equalsIgnoreCase("s")) {
                System.out.println("Bye Bye");
                break;
            } else {
                System.out.println("Ops! Opção inválida.");
            }

        }

    }

    private static void criarConta() {
        System.out.println("Qual é o seu e-mail?");
        var email = console.nextLine();

        System.out.println("Qual é o seu nome?");
        var nome = console.nextLine();

        System.out.println("Qual é a sua senha?");
        var senha = console.nextLine();

        var u = redeSocial.criarConta(email, senha,
                                      nome);

        System.out.println("Conta criado com sucesso");
        System.out.println(u);


    }
}
