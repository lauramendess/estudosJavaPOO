package Metodos;
import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus(){
        System.out.format("Personagem: %s com %d de força e %d de nível\n", nome, forca, nivel);
    }

    int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(20);

        int dano = forca + dado20Faces;

        return dano;
    }

    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();

        if(habilidade.length() == 0)
            System.out.format("%s atacou %s e causou %d de danos.\n", nome, alvo, forca);
        else
            System.out.format("%s usou '%s' contra %s e causou %d de danos.\n", nome, habilidade, alvo, danoCausado);
    }
}