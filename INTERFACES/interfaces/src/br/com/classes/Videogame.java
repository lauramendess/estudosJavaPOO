package br.com.classes;

public class Videogame {
    private boolean estaligado;
    private Jogo jogo;

    public void ligar(){
        System.out.println("Ligando o videogame...");
        this.estaligado = true;
    }

    public void jogar(Jogo jogo){
        if(estaligado){
            System.out.println("Iniciando o jogo...");
            this.jogo = jogo;
            jogo.jogar();

        } else{
            System.out.println("O videogame está desligado");
        }
    }

    public void fechar(){
        if(estaligado){
            System.out.println("Fechando o jogo...");

            if(jogo != null){
                jogo.fechar();
                jogo = null;
            } else{
                System.out.println("Nenhum jogo foi iniciado");
            }
        } 
        else{
            System.out.println("O videogame está desligado");
        }    
    }
}
