package org.example;

import java.util.Scanner;

/*Exercício 3: Enum com Switch-Case e Scanner

Crie um enum chamado UnidadeTemperatura representando unidades de temperatura (CELSIUS, FAHRENHEIT, KELVIN).

Escreva um programa que utiliza um Scanner para obter a unidade de temperatura atual do usuário e a unidade desejada, pedindo a temperatura atual e imprimindo a temperatura convertida.

        CELSIUS:
F -> (celsius * 9 / 5) + 32
K -> celsius + 273.15

FAHRENHEIT:
C -> (fehrenheit - 32) * 5 / 9
k -> (fehrenheit + 459.67) * 5 / 9
KELVIN:
C-> kelvin - 273.15
F-> (kelvin * 9 / 5) - 459.67
*/
public class ex3 {

    enum UnidadeTemperatura {
        CELSIUS,
        FAHRENHEIT,
        KELVIN
    }
    public static double ConverteCelsius(double celsius, UnidadeTemperatura op) {
        double valor = 0;
        switch (op) {
            case FAHRENHEIT:
                valor = (celsius * 9 / 5) + 32;
                break;
            default:
                valor = celsius + 273.15;

        }
        return valor;
    }
    public static double ConverteKelvin(double kelvin, UnidadeTemperatura op) {
        double valor = 0;
        switch (op) {
            case CELSIUS:
                valor = kelvin - 273.15;
                break;
            default:
                valor = (kelvin * 9 / 5) - 459.67;
        }
        return valor;
    }

    public static double ConverteFahrenheit(double fehrenheit, UnidadeTemperatura op) {
        double valor = 0;
        switch (op) {
            case CELSIUS:
                valor = (fehrenheit - 32) * 5 / 9;
                break;
            default:
                valor = (fehrenheit + 459.67) * 5 / 9;
        }
        return valor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        double temperatura = sc.nextDouble();
        System.out.println("Digite o tipo da temperatura atual(CELSIUS, FAHRENHEIT ou KELVIN):");
        String grauAtual = sc.next();
        System.out.println("Digite o tipo da temperatura desejada(CELSIUS, FAHRENHEIT ou KELVIN):");
        String grauDesejado = sc.next();
        UnidadeTemperatura op = UnidadeTemperatura.valueOf(grauAtual);
        UnidadeTemperatura op2 = UnidadeTemperatura.valueOf(grauDesejado);
        double converter = 0;
        switch (op) {
            case CELSIUS:
                converter = ConverteCelsius(temperatura, op2);
                break;
            case FAHRENHEIT:
                converter = ConverteFahrenheit(temperatura, op2);
                break;
            case KELVIN:
                converter = ConverteKelvin(temperatura, op2);
                break;
            default:
                System.out.println("Erro");
        }
        System.out.printf("%.2f %s é igual a %.2f %s", temperatura, op, converter, op2);
        sc.close();
    }
}
