package Metodos;
public class Metodos {

    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.forca = 30;
        heroi.nivel = 10;

        heroi.mostrarStatus();
        heroi.atacar("Hydra", "Golpe Duplo");
    }
}