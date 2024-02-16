package org.example.Aula2;


// Criar a representação de um executor de disco (aparelho de som)
// -Lembre-se de mapear as características
// -Lmbre-se de criar as ações possíveis
//      -As ações não precisam ser implementadas, apenas declaradas

public class AparelhoDeSom {

    //Atributos
    private String modelo;
    private String marca;
    private Integer ano;
    private Float potencia;
    private Integer voltagem;
    private String[] conectores; //Usb, microfone, cd, dvd, radio
    private Integer volume;
    private Boolean ligado;
    private Boolean discoInserido;
    private Boolean usbConectado;
    private Disco disco;

    //Ações

    public void ligar() {
        if(!ligado)
            ligado = true;
    }

    public void desligar() {
        if(ligado)
            ligado = false;
    }


    public void inserirDisco(Disco disco) {
        if(!discoInserido) {
            discoInserido = true;
            this.disco = disco;
        }
        else {
            System.out.println("Já há um disco inserido.");
        }
    }

    public void retirarDisco() {
        if(discoInserido) {
            discoInserido = false;
            this.disco = null;
        }
        else {
            System.out.println("Nenhum disco inserido");
        }
    }

    public void aumentarVol() {
        if(ligado && volume < 100)
            volume++;
    }

    public void abaixarVol() {
        if(ligado && volume > 0)
            volume--;
    }

    private void avancarFaixa() {

    }

    private void voltarFaixa() {

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

    private String lerDados() {
        if(discoInserido) {
            return disco.fornecerDados();
        }
        return "Disco não encontrado.";
    }
}


