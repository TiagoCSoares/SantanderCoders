package org.example.Aula2;


// Criar a representação de um executor de disco (aparelho de som)
// -Lembre-se de mapear as características
// -Lmbre-se de criar as ações possíveis
//      -As ações não precisam ser implementadas, apenas declaradas

public class AparelhoDeSom {

    //Atributos
    public String modelo;
    public String marca;
    public Integer ano;
    public Float potencia;
    public Integer voltagem;
    public String[] conectores; //Usb, microfone, cd, dvd, radio
    public Integer volume;
    public Boolean ligado;
    public Boolean discoInserido;
    public Boolean usbConectado;


    //Ações

    public void ligar() {
        if(!ligado)
            ligado = true;
    }

    public void desligar() {
        if(ligado)
            ligado = false;
    }


    public void inserirDisco() {
        if(!discoInserido)
            discoInserido = true;
    }

    public void retirarDisco() {
        if(discoInserido)
            discoInserido = false;
    }

    public void aumentarVol() {
        if(ligado && volume < 100)
            volume++;
    }

    public void abaixarVol() {
        if(ligado && volume > 0)
            volume--;
    }

    public void avancarFaixa() {

    }

    public void voltarFaixa() {

    }

    public boolean aceitaConector(String conector) {

        return true;
    }



    public AparelhoDeSom(Float potencia, Integer voltagem, String[] conectores) {
        this.modelo = "";
        this.marca = "";
        this.ano = 0;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.conectores = conectores;
        this.volume = 0;
        this.ligado = false;
        this.discoInserido = false;
        this.usbConectado = false;
    }
    public AparelhoDeSom(String modelo, String marca, Integer ano, Float potencia,
                         Integer voltagem, String[] conectores) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.conectores = conectores;
        this.volume = 0;
        this.ligado = false;
        this.discoInserido = false;
        this.usbConectado = false;
    }
}


