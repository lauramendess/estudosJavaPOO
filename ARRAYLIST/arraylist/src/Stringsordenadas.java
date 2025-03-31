import java.util.ArrayList;
import java.util.Collections;

public class Stringsordenadas {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Carlos");

        System.out.println("\nNomes Crescentes:");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Decrescentes:");

        Collections.sort(nomes, Collections.reverseOrder());

        for (String nome : nomes) {
            System.out.println(nome);
        }    

    }
}
