package org.example;

public class PrePosFixadoMain {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        int resultadoPreFixado = ++a;
        int resultadoPosFixado = b++;

        System.out.println(resultadoPreFixado);
        System.out.println(resultadoPosFixado);
        System.out.println(b);
    }
}
