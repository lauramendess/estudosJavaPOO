import br.com.classes.ContaBancaria;
import br.com.classes.Pessoa;

public class GetterseSetters {
    public static void main(String[] args) {
        // COMPLEMENTO PACKAGE CLASSES -> Pessoa.java e ContaBancaria.java
        
        Pessoa pessoa = new Pessoa("Laura");

        pessoa.imprimirDados();
        // modificar -> setNomVariavel
        // pegar -> getNomeVariavel

        /*
         
        System.out.println(pessoa.getNome());

        System.out.println(pessoa.getIdade());
        */

        ContaBancaria conta = new ContaBancaria();
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        System.out.println(conta.getSaldo());
    }
}
