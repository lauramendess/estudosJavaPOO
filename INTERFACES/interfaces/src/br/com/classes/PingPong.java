package br.com.classes;

public class PingPong implements Jogo {

    @Override
    public void fechar() {
        System.out.println("Salvar o progresso do jogo");
        System.out.println("Fechar o jogo");
    }

    @Override
    public void jogar() {
        System.out.println("Iniciar o jogo");
        System.out.println("Jogar o jogo");
    }
    
}
