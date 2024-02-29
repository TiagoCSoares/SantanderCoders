package org.example;

public class Caminhao extends Veiculo{

    public Caminhao(String modelo, Integer ano) {
        super(modelo, ano);
    }

    public void controleDeCarga(double peso, int distancia) {
        System.out.println("Controlando carga");
    }

    public void calcularRota(String[] pontosDeReferencia) {
        System.out.println("Gerando rota inteligente");
    }

    @Override
    public void acelerar(int velocidade){
        System.out.println("Caminhão acelerando");
    };

    @Override
    public void frear(int velocidade) {
        System.out.println("Caminhão freando");
    };



}
