import java.math.BigDecimal;

public class MainPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Will");
        pessoa.respirar();
        mantenhaSeVivo(pessoa);

        Professor professor = new Professor();
        professor.setNome("Will");
        professor.respirar();
        professor.darAula();
        calcularSalario(professor);
        mantenhaSeVivo(professor);

        Aluno aluno = new Aluno();
        aluno.setNome("Joao");
        aluno.respirar();
        aluno.prestarAtencao();
        mantenhaSeVivo(aluno);

        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Thiago");
        bolsista.prestarAtencao();
        bolsista.setBolsa(BigDecimal.ONE);
        bolsista.realizarPesquisa();
        mantenhaSeVivo(bolsista);
        realizarPesquisa(bolsista);
    }

    public static void calcularSalario(Professor professor) {
        BigDecimal zero = BigDecimal.ZERO;
        professor.setSalario(zero);
    }

    public static void mantenhaSeVivo(Pessoa pessoa) {
        pessoa.respirar();
    }

    public static void realizarPesquisa(Bolsista bolsista) {
        bolsista.realizarPesquisa();
    }

}
