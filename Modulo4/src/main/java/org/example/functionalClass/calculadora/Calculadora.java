package org.example.functionalClass.calculadora;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputCalculadora<BigDecimal> inputPrimeiroValor = new InputCalculadora(
                "Qual o primeiro valor?",
                value -> new BigDecimal(String.valueOf(value)));

        InputCalculadora<BigDecimal> inputSegundoValor = new InputCalculadora(
                "Qual o segundo valor?",
                value -> new BigDecimal(String.valueOf(value)));


        InputCalculadora<BiFunction<BigDecimal, BigDecimal, BigDecimal>> operacao = new InputCalculadora<>(
                "Qual a operação?", simbolo -> {
            if (simbolo.equals("Soma")) {
                return (primeiroValor, segundoValor) -> primeiroValor.add(segundoValor);
            }
            return null;
        }
        );

        System.out.println(operacao.capture().apply(inputPrimeiroValor.capture(), inputSegundoValor.capture()));



        /*Function<String, BiFunction<BigDecimal, BigDecimal, BigDecimal>> operacao = new Function<String, BiFunction<BigDecimal, BigDecimal, BigDecimal>>() {
            @Override
            public BiFunction<BigDecimal, BigDecimal, BigDecimal> apply(String s) {
                if (s.equals("Soma")) {
                    return (a, b) -> a.add(b);
                } else if (s.equals("Subtração")) {
                    return (a, b) -> a.subtract(b);
                }
                return null;
            }
        }
            ;

        System.out.println(operacao.apply("Subtração")
                .apply(inputPrimeiroValor.capture(),inputSegundoValor.capture()));
*/
    }
}