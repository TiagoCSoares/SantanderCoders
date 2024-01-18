package org.example;

import java.util.Scanner;

public class ex1 {

    enum OperacaoMatematica {
        ADICAO,
        MULTIPLICACAO,
        DIVISAO,
        SUBTRACAO,
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a operação desejada? (ADICAO, MULTIPLICACAO, DIVISAO, SUBTRACAO)");
        String tipoOperacao = scanner.next();
        OperacaoMatematica operacao = OperacaoMatematica.valueOf(tipoOperacao);
        System.out.println("Digite o primeiro valor");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        double b = scanner.nextDouble();

        if(tipoOperacao == "DIVISAO" && b == 0) {
            System.out.println("Impossível realizar a divisão");
            scanner.close();
            return;
        }
        double resultado;
        switch (operacao) {
            case ADICAO:
                resultado = a + b;
                break;
            case SUBTRACAO:
                resultado = a - b;
                break;
            case MULTIPLICACAO:
                resultado = a * b;
                break;
            case DIVISAO:
                resultado = a / b;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }
        System.out.printf("Resultado da operação: %.2f", resultado);
        scanner.close();
    }
}
