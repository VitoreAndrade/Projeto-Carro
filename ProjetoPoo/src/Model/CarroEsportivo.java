package Model;

public class CarroEsportivo extends Carro {

    private int velocidadeMaxima;
    private int velocidadeAtual;


    public CarroEsportivo(String marca, String modelo, int ano, int velocidadeMaxima) {
        super(marca, modelo, ano);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro esportivo!");
        setVelocidadeAtual(10 + getVelocidadeAtual());
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " - " + "Modelo: " + getModelo() + " - " + "Ano: " + getAno() + " - " + "Velocidade maxima: " + velocidadeMaxima + " km/h ";

    }
}
