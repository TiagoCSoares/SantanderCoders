package org.example;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int matriz[][] = new int[linhas][colunas];
        for(int i = 0; i < linhas; i++) {
            System.out.printf("Digite os elementos da %d linha:", i+1);
            for(int j = 0; j < colunas; j++) {
                System.out.println();
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maior = matriz[0][0];
        for(int[] linha : matriz) {
            for(int elemento : linha) {
                if(elemento > maior)
                    maior = elemento;
            }
        }
        System.out.printf("O maior elemento da matriz é: %d\n", maior);
        scanner.close();
    }
}
