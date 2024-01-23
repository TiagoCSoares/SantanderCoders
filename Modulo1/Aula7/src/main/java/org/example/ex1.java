package org.example;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {

        Random numero = new Random();
        int[] arrayInt = new int[10];
        int total = 0;
        int count = 0;

        for(int i = 0; i < 10; i++) {
            arrayInt[i] = numero.nextInt(100) + 1;
        }

        for(int i = 0; i < 10; i++) {
            if(arrayInt[i]%2 == 0) {
                total += arrayInt[i];
                count++;
            }
        }
        int media = total/count;
        System.out.printf("A média dos números pares no array é: %d", media);
    }
}