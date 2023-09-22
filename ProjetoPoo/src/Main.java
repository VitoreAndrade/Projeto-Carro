import Model.Carro;
import Model.CarroEsportivo;
import Model.Motor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("HONDA", "CIVIC",2023,
                new Motor("2.0 aspirado com injeção direta movido a gasolina.", "143 cavalos"));
        carro.rodar(80);
        System.out.println(carro);

        CarroEsportivo carroEsportivo = new CarroEsportivo("Porshe","911 carrera s",2023,308,
                new Motor(" biturbo de 6 cilindros e 3,0 litros","350 cavalos"));
        carroEsportivo.acelerar(250);
        System.out.println(carroEsportivo);





    }
}