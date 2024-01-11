package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VariableMain {
    public static void main(String[] args) {

        int idade = 26;
        int idade2;
        idade2 = 30;

        int idade1, idade3, idade4;
        idade1 = 10;
        idade2 = 15;
        idade4 = 40;

        int numeor = 1, numero2 = 2, numero3 = 3;

        final char genero;
        genero = 'M';

        final char genero1 = 'F';

        String filme = GeneroDeFilme.DRAMA.name();
        String generoInEnglish = GeneroDeFilme.ROMANCE.getGeneroFilmeInEnglish();

        System.out.println("Genero filme em pt-br: " + filme);
        System.out.println("Genero filme en : " + generoInEnglish);

        System.out.println("Hello world");
    }
    public enum GeneroDeFilme{
        TERROR("horror"),
        ROMANCE("romance1"),
        DRAMA("drama1"),
        COMEDIA("comedy");

        private final String english;
        GeneroDeFilme(String horror) {
            this.english = horror;
        }

        public String getGeneroFilmeInEnglish() {
            return english;
        }

    }

}