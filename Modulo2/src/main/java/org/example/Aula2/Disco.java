package org.example.Aula2;

public class Disco {


    //Atributos ou propriedades descrevem as caracteristicas de um objeto
    private final String nome;
    private final String autor;
    private final String genero;
    private final Integer anoLancamento;
    private final Integer numeroFaixas;
    private final String subtitulo;
    private final String participacoes;

    //Assinatura de método (nome + parametros)
    public Disco(
            String nome,
            String autor,
            String genero,
            Integer anoLancamento,
            Integer numeroFaixas
    ) {
        this(nome, autor, genero, anoLancamento, numeroFaixas, null, null);
    }

    public Disco(
            String nome,
            String autor,
            String genero,
            Integer anoLancamento,
            Integer numeroFaixas,
            String subtitulo,
            String participacoes
    ) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.numeroFaixas = numeroFaixas;
        this.subtitulo = subtitulo;
        this.participacoes = participacoes;
    }

    //Acoes são descritas como métodos
    public String fornecerDados() {
        return "la la la la la la la la";
    }

}
