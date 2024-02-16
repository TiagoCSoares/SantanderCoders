import java.util.List;

public class Pessoa {

    private String nome;

    public void setNome(String nome) {
        if (!nomeVexatorios().contains(nome)) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void respirar() {
        System.out.println("Mantendo-me vivo");
    }

    private List nomeVexatorios() {
        return List.of("Nome um", "Nome dois");
    }

}
