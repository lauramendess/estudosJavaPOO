import javax.swing.text.Document;

import br.com.devflix.interfaces.*;
import br.com.devflix.interfaces.botoes.*;
import br.com.devflix.videos.*;

public class Packages {
    public static void main(String[] args) {
        // ESTUDOS SOBRE PACKAGES 
        // PASTAS: VIDEOS E INTERFACES 

        Filme filme = new br.com.devflix.videos.Filme();

        Novela novela = new Novela();

        Documentario documentario = new Documentario();

        Serie serie = new Serie();

        Anime anime = new Anime();

        Janela janela = new Janela();
        
        Miniaturavideo miniatura = new Miniaturavideo();

        BotaoPlay botaoPlay = new BotaoPlay();
    }
}
