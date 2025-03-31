import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayDinamico = new ArrayList<String>();

        arrayDinamico.add("Laura");
        arrayDinamico.add("Juan");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Geovana");

        System.out.println("Tamanho do arraylist " + arrayDinamico.size());

        System.out.println("Imprimindo Array Dinâmico:");
        // FOREACH:
        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }

        System.out.println("Removendo o nome Pedro...");
        arrayDinamico.remove("Pedro");

        System.out.println("Imprimindo Array Dinâmico após remover Pedro:");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        arrayDinamico.clear();
        System.out.println("Tamanho do arraylist após limpar " + arrayDinamico.size());
    }
}
