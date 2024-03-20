package org.example.functionalClass;

import java.time.LocalDateTime;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Void para quando não tem retorno, sempre retorna null
        Function<Void, Void> imprimirHorarioAtual = new Function<Void, Void>() {
            //Ao declarar Void é obrigatório retornar null
            @Override
            public Void apply(Void unused) {
                System.out.println(LocalDateTime.now());
                return null;
            }
        };

        // Executando a função
        imprimirHorarioAtual.apply(null);

    }

    public void imprimirHorario(Object paraImprimir) {
        System.out.println(paraImprimir);
    }
}
