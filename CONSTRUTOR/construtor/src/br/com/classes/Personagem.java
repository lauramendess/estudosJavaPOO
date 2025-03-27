package br.com.classes;

import javax.swing.JOptionPane;

public class Personagem {
    // Atributos da classe:
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    // Método construtor:
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        
        if(classe.equals("Guerreiro")){
            forca = nivel * 2;
        } else if(classe.equals("Mago")){
            forca = nivel * 3;
        } else {
            forca = nivel;
        }
    }

    // Métodos específicos:
    public void mostrarStatus(){
        String status = String.format("Nome: %s\nNível: %d\nVida: %d\nClasse: %s\nForça: %d\n", 
            nome, 
            nivel, 
            vida, 
            classe, 
            forca);
            
        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos getters e setters:

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return int return the forca
     */
    public int getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * @return int return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }


    /**
     * @return String return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

}
