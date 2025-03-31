import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        /*
            Tipo Primitivo     ->   Wrapper Class
            int                ->   Integer
            float              ->   Float
            double             ->   Double
            char               ->   Character
        */
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(100);
        numeros.add(200);

        Pessoa joao = new Pessoa("João", 20);
        Pessoa maria = new Pessoa("Maria", 25);
        Pessoa pedro = new Pessoa("Pedro", 30);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
