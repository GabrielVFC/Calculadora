package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criação de entrada de dados pelo usuario
        Scanner digite = new Scanner(System.in);

        //Variaveis criados para usar nos calculos

        int soma, subtracao, multiplicacao, delta,x1,x2;
        double divisao, potenciaPrimeiro, potenciaSegundo, potenciaTerceiro;

        //O usuario irá escrever os numeros para serem calculados

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = digite.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = digite.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terceiroNumero = digite.nextInt();

        //Calculo dos numeros introduzidos pelo usuario

        soma = primeiroNumero + segundoNumero;
        subtracao = primeiroNumero - segundoNumero;
        multiplicacao = primeiroNumero * segundoNumero;
        divisao = (double) primeiroNumero/ segundoNumero;
        potenciaPrimeiro = Math.pow(primeiroNumero, 2);
        potenciaSegundo = Math.pow(segundoNumero, 2);
        potenciaTerceiro = Math.pow(terceiroNumero, 2);
        delta = (int) Math.pow(segundoNumero, 2) - 4 * primeiroNumero * terceiroNumero;

        //Saída dos calculos feito pelo programa

        System.out.println("A soma entre %d, %d e %d é igual a: %d".formatted(primeiroNumero, segundoNumero, terceiroNumero, soma));
        System.out.println("A subtração entre %d, %d e %d é igual a: %d".formatted(primeiroNumero, segundoNumero, terceiroNumero, subtracao));
        System.out.println("A multiplicação entre %d,%d e %d é igual a: %d".formatted(primeiroNumero, segundoNumero, terceiroNumero, multiplicacao));
        System.out.println("A divisão entre %d e %d é igual a: %.2f".formatted(primeiroNumero, segundoNumero, divisao));
        System.out.println("O número %d elevado a 2 é igual a: %.0f".formatted(primeiroNumero, potenciaPrimeiro));
        System.out.println("O número %d elvado a 2 é igual a: %.0f".formatted(segundoNumero, potenciaSegundo));
        System.out.println("O número %d elvado a 2 é igual a: %.0f".formatted(terceiroNumero, potenciaTerceiro));

        //Testes para saber se o número tem raiz quadrada ou não

        if (testeRaiz(primeiroNumero)){
            System.out.println("Esse número tem raiz!");
        } else {
            System.out.println("Esse número não tem raiz!");
        }

        if (testeRaiz(segundoNumero)){
            System.out.println("Esse número tem raiz!");
        } else {
            System.out.println("Esse número não tem raiz!");
        }

        if (testeRaiz(terceiroNumero)) {
            System.out.println("Esse número tem raiz!");
        } else {
            System.out.println("Esse número não tem raiz!");
        }

        //Teste para saber se o delta é um valor verdadeiro ou não para a expressão de segundo grau

        if (testeRaiz(delta)){
            x1 = (int) ((-segundoNumero + Math.sqrt(delta)) / 2 * primeiroNumero);
            System.out.println("O resultado do x1 na equação de segundo grau é: %d".formatted(x1));
        } else {
            System.out.println("Delta invalido!");
        }
        if (testeRaiz(delta)){
            x2 = (int) ((-segundoNumero - Math.sqrt(delta)) / 2 * primeiroNumero);
            System.out.println("O resultado do x2 na equação de segundo grau é: %d".formatted(x2));
        } else {
            System.out.println("Delta invalido!");
        }

    }



    public static boolean testeRaiz(int numero) {
        //Aqui calcula a raiz quadrada do numero
        double testeRaiz = Math.sqrt(numero);
        //Aqui testa se o numero menos o arrendondamento dele para baixo é igual a zero
        return ((testeRaiz - Math.floor(testeRaiz)) == 0);
    }

}
