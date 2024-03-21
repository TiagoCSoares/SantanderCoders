package org.example.functionalClass.calculadora;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Converter <T extends Number> {

    private Function<T, BigDecimal> converter;

    public Converter(Function<T, BigDecimal> converter) {
        this.converter = converter;
    }
}
