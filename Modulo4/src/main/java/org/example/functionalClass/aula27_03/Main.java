package org.example.functionalClass.aula27_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Dada uma lista de números inteiros,
    filtre apenas os números pares e,
    em seguida, mapeie esses números para seus quadrados.
    */

    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            inteiros.add(i);
        }

        List<Integer> quadrados =  inteiros.stream()
                .filter(numero -> numero%2 == 0)
                .map(numero -> numero*numero)
                .toList();

        quadrados.forEach(System.out::println);
    }
}
