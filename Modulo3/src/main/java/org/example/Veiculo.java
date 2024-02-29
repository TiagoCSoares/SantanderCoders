package org.example;

public abstract class Veiculo {

    private String modelo;
    private Integer ano;
    private Integer velocidade;

    public Veiculo(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }



    public abstract void acelerar(int velocidade);

    public abstract void frear(int velocidade);

    public final void buzinar() {  // O método final não pode ser alterado, nem sobreescrito
        System.out.println("Buzinando");
    }
}
