

import classes.ContaBancaria;
import classes.Pessoa;

public class GetterseSettings {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // modificar -> setNomVariavel
        // pegar -> getNomeVariavel

        System.out.println(pessoa.getNome());
        pessoa.setNome("João");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(25);
        System.out.println(pessoa.getIdade());

        pessoa.setAltura(1.85);
        System.out.println(pessoa.getAltura());

        ContaBancaria conta = new ContaBancaria();
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        System.out.println(conta.getSaldo());
    }
}
