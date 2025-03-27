// ESTUDOS SOBRE CONSTRUTOR = ARQUIVO APOIO: PERSONAGEM.JAVA, DENTRO DO PACKAGE BR.COM.CLASSES

import javax.swing.JOptionPane;

import br.com.classes.Personagem;

public class Construtor {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do personagem:");
        String classe = JOptionPane.showInputDialog(null,"Digite a classe do personagem:");

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}
