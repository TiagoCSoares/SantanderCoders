package movie;

import java.util.ArrayList;

public class MainFilmes {

    public static void main(String[] args) {
        Ator ator = new Ator();
        ator.setNome("Pedro");

        Diretor diretor = new Diretor();
        diretor.setNome("Will");

        Filme filme = new Filme();
        filme.setNome("A aula do terror");
        filme.adicionarAtor(ator);

        if (filme.getDiretores() == null) {
            filme.setDiretores(new ArrayList());
        }
        filme.getDiretores().add(diretor);

        if (ator.getFilmes() == null) {
            ator.setFilmes(new ArrayList());
        }
        ator.getFilmes().add(filme);

        if (diretor.getFilmes() == null) {
            diretor.setFilmes(new ArrayList());
        }
        diretor.getFilmes().add(diretor);
    }

}
