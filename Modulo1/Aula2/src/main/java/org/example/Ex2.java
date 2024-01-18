package org.example;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int c = scanner.nextInt();

        int maior = (a >= b && a >= c)?a:(b>=c && b >=a)?b:c;

        System.out.printf("O maior número é: %d", maior);

        scanner.close();
    }
}


