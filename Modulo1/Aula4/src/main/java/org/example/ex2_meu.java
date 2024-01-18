package org.example;


import java.util.Scanner;

public class ex2_meu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o mês:");
        int mes = scanner.nextInt();
        if(mes > 12 || mes < 1) {
            System.out.println("Mês inválido");
            return;
        }
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();
        int retorno = quantidadeDeDias(mes, ano);
        MesAno mesEnum = MesAno.values()[mes - 1];
        System.out.printf("A quantidade de dias em %s, no ano %d é: %d", mesEnum, ano, retorno);
        scanner.close();
    }
    public static int quantidadeDeDias(int mes, int ano) {

        boolean bissexto = (ano%4 == 0 && ano%100 != 0?true:false);
        return mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 10 || mes == 12?31 :
                mes == 2 && bissexto?29:
                mes == 2?28:
                        30;

    }
    public enum MesAno {
        JANEIRO,
        FEVEREIRO,
        MARCO,
        ABRIL,
        MAIO,
        JUNHO,
        JULHO,
        AGOSTO,
        SETEMBRO,
        OUTUBRO,
        NOVEMBRO,
        DEZEMBRO
    }
}

