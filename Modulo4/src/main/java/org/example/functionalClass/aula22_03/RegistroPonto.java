package org.example.functionalClass.aula22_03;

import java.time.LocalDateTime;

public class RegistroPonto {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private String nome;

    public RegistroPonto(LocalDateTime entrada, LocalDateTime saida, String nome) {
        this.entrada = entrada;
        this.saida = saida;
        this.nome = nome;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public String getNome() {
        return nome;
    }
}