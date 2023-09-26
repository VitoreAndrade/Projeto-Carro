import Model.Carro;
import Model.CarroEsportivo;
import Model.Motor;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n --- Questão 01 ---");
        Carro carro = new Carro("HONDA", "CIVIC", 2023);
        Motor motor = new Motor("2.0 aspirado com injeção direta movido a gasolina.", "143 cavalos");
        carro.rodar(80);
        System.out.println(carro);

        System.out.println("\n --- Questão 02 ---");
        System.out.println("Quilometragem: " + carro.getQuilometragem());

        System.out.println("\n ---- Questão 03 ----");
        CarroEsportivo carroEsportivo = new CarroEsportivo("Porshe", "911 carrera s", 2023, 330);
        carroEsportivo.acelerar();
        System.out.println(carroEsportivo);
        carroEsportivo.setVelocidadeMaxima(80);
        System.out.println(carroEsportivo);

        System.out.println("\n ---- Questão 04 ----");
        Motor motorEsportivo = new Motor("biturbo de 6 cilindros e 3,0 litros", "350 cavalos");
        Carro carroMotor = new Carro("Marca","Modelo",2023,motorEsportivo);
        carroMotor.ligarCarro();
    }
}