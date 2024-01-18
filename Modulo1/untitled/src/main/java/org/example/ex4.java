package org.example;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número");

        int valor = scanner.nextInt();

        String mes = valor == 1 ? "Janeiro" :
                        valor == 2 ? "Fevereiro" :
                        valor == 3 ? "Março" :
                        valor == 4 ? "Abril" :
                        valor == 5 ? "Maio" :
                        valor == 6 ? "Junho" :
                        valor == 7 ? "Julho" :
                        valor == 8 ? "Agosto" :
                        valor == 9 ? "Setembro" :
                        valor == 10 ? "Outubro" :
                        valor == 11 ? "Novembro" :
                        valor == 12 ? "Dezembro" :
                        "Erro";
        System.out.println(mes);
        scanner.close();
    }
}
