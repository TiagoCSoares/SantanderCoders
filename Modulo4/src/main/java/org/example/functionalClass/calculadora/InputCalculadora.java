package org.example.functionalClass.calculadora;

import java.util.Scanner;
import java.util.function.Function;

public class InputCalculadora <R> {

    public String title;
    // Função para converter o texto capturado
    private Function<String, R> converter;

    public InputCalculadora(String title, Function<String, R> converter) {
        this.title = title;
        this.converter = converter;
    }

    public R capture() {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        var text = scanner.nextLine();

        return converter.apply(text);
    }

}
