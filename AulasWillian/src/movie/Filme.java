package movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filme {

    private String nome;
    private List atores;
    private List diretores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getAtores() {
        return Collections.unmodifiableList(atores);
    }

    public List getDiretores() {
        return diretores;
    }

    public void setDiretores(List diretores) {
        this.diretores = diretores;
    }

    public void adicionarAtor(Ator ator) {
        if (this.atores == null) {
            this.atores = new ArrayList();
        }
        this.atores.add(ator);
    }

}
