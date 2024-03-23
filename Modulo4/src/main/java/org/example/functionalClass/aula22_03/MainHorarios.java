package org.example.functionalClass.aula22_03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


public class MainHorarios {

    public static void main(String[] args) {
        List<RegistroPonto> registroPontos = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 100; index++) {
            var horas = random.nextInt(1, 10);
            registroPontos.add(new RegistroPonto(LocalDateTime.now().minusHours(horas),
                    LocalDateTime.now(),
                    "Funcionário " + index));
        }


        // Utilizando a lista de ponto acima, calcule quais o registros passaram de 8 horas trabalhadas.
        // Os registros que passarem de oito horas devem ser impressos na tela.
        //Abaixo: Retornar os funcionráios que trabalharam mais que 8 horas, métodos diferentes de implementação
        BiFunction<LocalDateTime, LocalDateTime, Long> calcularDiferencaHoras = (entrada, saida) -> {
            return  ChronoUnit.HOURS.between(entrada, saida);
        };


        Predicate<BiFunction<LocalDateTime, LocalDateTime, Long>> filtroHoras = (funcao) ->
                funcao.apply(registroPontos.get(0).getEntrada(), registroPontos.get(0).getSaida()) > 8L;
        registroPontos.stream()
                .filter(registro -> filtroHoras.test(calcularDiferencaHoras));
                //.forEach(System.out::println);


        registroPontos.forEach(registro -> {
            Predicate<BiFunction<LocalDateTime, LocalDateTime, Long>> filtroHoras8 = (funcao) ->
                    funcao.apply(registro.getEntrada(), registro.getSaida()) > 8L;
        });

        registroPontos.stream()
                .filter(registro -> calcularDiferencaHoras.apply(registro.getEntrada(), registro.getSaida()) > 8)
                .forEach(System.out::println);







        // Utilizando a lista de ponto acima, construa um stream.
        // Para cada registro de ponto dentro do stream, calcule se excedeu 8 horas trabalhadas.
        // Caso tenha excedido imprima na tela o valor: $nome, você ganhou um dia de folga.
        registroPontos.stream()
                .filter(registro -> ChronoUnit.HOURS.between(
                        registro.getEntrada(),
                        registro.getSaida()) > 8)
                //.map(registro -> registro.getNome() + ", você ganhou um dia de folga")
                //.forEach(System.out::println);
                .forEach(registro -> System.out.println(registro.getNome() +
                        ", você ganhou um dia de folga"));

    }

}
