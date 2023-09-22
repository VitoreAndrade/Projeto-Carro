package Model;

public class Carro {

    Motor motor;
    private String marca;
    private String modelo;
    private int ano;
    private int acelerar;
    private double quilometragem;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void rodar(double quilometragemPercorrida) {
        if (motor.isLigado()) {
            if (quilometragemPercorrida >= 0) {
                this.quilometragem += quilometragemPercorrida;
            }
        }
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado");


    }

    public void desligarCarro() {
        System.out.println("Carro desligado");
        motor.desligar();
    }

    public String toString() {
        return "Carro " + " - " + "Marca: " + marca + " - " + "Modelo: " + modelo + " - " + "Ano: " + ano + " - " + "Quilometros percorridos: " + quilometragem + " - " + "Motor: " + motor;

    }
}


