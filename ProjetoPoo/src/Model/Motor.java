package Model;

public class Motor {

    private String tipo;
    private String potencia;

    public Motor(String tipo, String potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Motor: " + tipo + " - " + "Potência: " + potencia;


    }

}
