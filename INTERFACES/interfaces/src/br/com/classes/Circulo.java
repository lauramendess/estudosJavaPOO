package br.com.classes;

public class Circulo implements FiguraGeomatrica{
    // Atributos
    private int raio;

    // Construtor
    public Circulo(int raio) {
        this.raio = raio;
    }

    // Métodos específicos da classe
    @Override
    public double calcularArea() {
        // area = PI * raio^2
        return Math.PI * Math.pow(raio, 2);
    }

    // Métodos getters e setters

    /**
     * @return int return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }

}
