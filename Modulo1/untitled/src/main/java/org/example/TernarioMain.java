package org.example;

public class TernarioMain {

    public static void main(String[] args) {

        int numero = 7;
        String resultado = (numero % 2 == 0)?"par" : "impar";

        int valor = 5;
        String tipo = (valor > 0)?"positivo": (valor < 0)?"negativo":"zero";

        //Calcular o desconto com base na quantidade comprada
        int quantidade = 15;
        double precoUnitario = 50.0;
        double desconto = (quantidade > 10) ? precoUnitario * 0.01 : 0;

        double precoTotal = quantidade * (precoUnitario - desconto);

        System.out.println(resultado);
    }
}
