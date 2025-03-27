package br.com.classes;

public class Quadrado implements FiguraGeomatrica{
    // Atributos
    private int lado;

    // Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    // Métodos específicos da classe
    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }

    // Getters e Setters

    /**
     * @return int return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

}
