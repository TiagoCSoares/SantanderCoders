package org.example;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em doláres");
        double dolar = scanner.nextDouble();
        System.out.printf("$%.2f doláres equivale a R$%.2f", dolar, conversor(dolar));
        scanner.close();
    }

    public static double conversor(double dolar) {
        return dolar*4.86;
    }
}
