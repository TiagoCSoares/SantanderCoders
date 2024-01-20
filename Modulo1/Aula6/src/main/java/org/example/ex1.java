package org.example;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt(10) + 1;

        System.out.printf("Numero aleatorio: %d", numeroAleatorio);
    }
}
