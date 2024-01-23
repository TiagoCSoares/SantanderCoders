package org.example;

import java.util.Scanner;
import java.util.Random;
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        int numero = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", numero, i, numero*i);
        }
    }
}
