package org.example;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner();

        int a = 1;
        int b = 20;
        int c = 35;
        int maior;

        maior = (a > b && a > c)?a : (b > c)?b : c;
        System.out.printf("maior: %d", maior);
    }
}
