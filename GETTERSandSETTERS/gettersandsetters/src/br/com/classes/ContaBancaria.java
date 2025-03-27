package br.com.classes;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Não é possível depositar um valor negativo");
            return;
        } else{
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
