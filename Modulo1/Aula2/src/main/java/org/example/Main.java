package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma valor de 1 a 7");

        int valor = scanner.nextInt();
        String dia = valor == 1?"Domingo":valor == 2?"Segunda":valor == 3?"Terça": valor == 4?"Quarta":valor == 5?"Quinta":valor == 6?"Sexta":valor==7?"Sábado":"Valor Invalido";
        System.out.printf("%s", dia);

        scanner.close();
    }
}