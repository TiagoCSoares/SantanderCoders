package org.example;

public class Carro extends Veiculo{

    public Carro(String modelo, Integer ano) {
        super(modelo, ano);
    }


    @Override
    public void acelerar(int velocidade){
        System.out.println("Carro acelerando");
    };

    @Override
    public void frear(int velocidade) {
        System.out.println("Carro freando");
    };
}
