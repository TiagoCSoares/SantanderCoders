package org.example;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = sc.nextInt();
        int divisor = 2;
        boolean verificador = true;
        sc.close();
        while(divisor < numero) {
            if(numero % divisor == 0) {
                verificador = false;
                break;
            }
            divisor++;
        }
        System.out.printf("O número %d %s", numero, (verificador?"é primo.":"não é primo."));
    }
}
