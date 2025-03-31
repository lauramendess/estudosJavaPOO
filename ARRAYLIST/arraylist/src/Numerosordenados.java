import java.util.ArrayList;
import java.util.Collections;

public class Numerosordenados {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(100);
        numeros.add(200);
        numeros.add(50);
        numeros.add(10);
        numeros.add(500);
        numeros.add(300);
        numeros.add(400);
        numeros.add(600);
        numeros.add(-700);

        System.out.println("\nNúmeros Crescentes:");

        Collections.sort(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("\nNúmeros Decrescentes:");

        Collections.sort(numeros, Collections.reverseOrder());

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
