package Model;

public class CarroEsportivo extends Carro {

    private int velocidadeMaxima;
    private int velocidadeAtual;


    public CarroEsportivo(String marca, String modelo, int ano, int velocidadeMaxima, Motor motor) {
        super(marca, modelo, ano, motor);
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

    public void acelerar(int velocidade) {
        if (motor.isLigado()) {
            setVelocidadeAtual(velocidade + getVelocidadeAtual());
            if (velocidade > 0) {
                System.out.println("motor ligado");
            }
        }
    }

    @Override
    public String toString() {
        return "Carro esportivo: " + " - " + "Marca: " + getMarca() + " - " + "Modelo: " + getModelo() + " - " + "Ano: " + getAno() + " - " + "Velocidade maxima: " + velocidadeMaxima + " km/h " + " - " + "Velocidade atual: " + velocidadeAtual + " km/h " + "Motor: " + motor;
    }
}
