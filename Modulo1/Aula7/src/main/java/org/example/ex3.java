package org.example;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {

        Random numero = new Random();
        double[] arrayDouble = new double[50];
        double maior = 0;

        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = numero.nextDouble(100) + 1;
        }

        for(int i = 0; i < arrayDouble.length; i++){
            if(arrayDouble[i] > maior)
                maior = arrayDouble[i];
        }

        System.out.printf("O maior número no array é: %.2f", maior);
    }
}
