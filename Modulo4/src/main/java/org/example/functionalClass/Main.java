package org.example.functionalClass;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Function<String, LocalDate> dateConverter = (value) -> LocalDate.parse(value, formatter);
        Function<String, BigDecimal> bicDecimalConverter = (value) -> new BigDecimal(value);

        InputData data = new InputData(
                "Informe uma data(dd/MM/yyyy)",
                dateConverter);
        var value = data.capture();
        System.out.println(value);

        InputData<BigDecimal> dataSalary = new InputData<>(
                "Informe o salário",
                bicDecimalConverter);
        var salary = dataSalary.capture();
        System.out.println(salary);

        BiFunction<BigDecimal, BigDecimal, String> soma = (first, second) -> first.add(second).toString();

        /*BiFunction<BigDecimal, BigDecimal, String> soma = new BiFunction<BigDecimal, BigDecimal, String>() {
            @Override
            public String apply(BigDecimal first, BigDecimal second) {
                return first.add(second).toString();
            }
        };*/
    }
}
