package org.example;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        char[] arrayChar = {'a', 'b', 'c', 'd', 'e'};
        char[] newArrayChar = new char[arrayChar.length];

        for(int i = 0; i < arrayChar.length; i++) {
            newArrayChar[arrayChar.length -1 -i] = arrayChar[i];
        }

        System.out.print("['" + newArrayChar[0] + "'");
        for(int i = 1; i < newArrayChar.length; i++) {
            System.out.print(", '"+ newArrayChar[i] + "'");
        }
        System.out.print("]");

        System.out.println();
        System.out.println(Arrays.toString(newArrayChar)
                .replace(", ", "', '")
                .replace("[", "['")
                .replace("]", "']"));
    }
}
