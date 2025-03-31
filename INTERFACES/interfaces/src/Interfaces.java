import br.com.classes.PingPong;
import br.com.classes.Videogame;

public class Interfaces {
    public static void main(String[] args) throws Exception {
        Videogame xDevone = new Videogame();
        xDevone.ligar();
        xDevone.jogar(new PingPong());
        xDevone.fechar();
    }
}
