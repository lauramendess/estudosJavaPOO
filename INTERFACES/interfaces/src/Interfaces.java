import br.com.classes.CalculadorArea;
import br.com.classes.Circulo;
import br.com.classes.Quadrado;

public class Interfaces {
    public static void main(String[] args) throws Exception {
        // Encapsulamento -> proteger os atributos de uma classe
        
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(5);

        CalculadorArea calculador = new CalculadorArea();
        System.out.println("Soma das áreas: " + calculador.somarAreas(circulo, quadrado));
    }
}
