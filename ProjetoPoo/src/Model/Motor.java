package Model;

public class Motor {

    private String tipo;
    private String potencia;
    private boolean ligado;

    public boolean isLigado(){
        return ligado;
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

    public Motor (String tipo, String potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void ligar (){
        if(!ligado){
            System.out.println("Motor ligado");
            ligado = true;
        }
    }

    public void desligar (){
        if(ligado){
            System.out.println("Motor desligado");
            ligado = false;
        }
    }
    @Override
    public String toString(){
       return " Tipo: " + tipo + " - " +
               "Potencia: " + potencia;


    }

}
