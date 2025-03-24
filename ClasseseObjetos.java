public class ClasseseObjetos {

    public static void main(String[] args) {
        // Classe é definida por um molde
        // Objeto é uma instância de uma classe
        
        // Instanciando um objeto da classe Celular:
        Celular celularA = new Celular();
        celularA.nome = "Galaxy S21";
        celularA.sistemaOperacional = "Android";
        celularA.armazenamento = 256;
        celularA.tamanhoTela = 6.1f;

        Celular celularB = new Celular();
        celularB.nome = "iPhone 12";
        celularB.sistemaOperacional = "iOS";
        celularB.armazenamento = 128;
        celularB.tamanhoTela = 6.9f;

        System.out.format("Celular %s com sistema operacional %s com armazenamento de %d GB e tamanho da tela %.1f\"\n", celularA.nome, celularA.sistemaOperacional, celularA.armazenamento, celularA.tamanhoTela);
        System.out.format("Celular %s com sistema operacional %s com armazenamento de %d GB e tamanho da tela %.1f\"\n", celularB.nome, celularB.sistemaOperacional, celularB.armazenamento, celularB.tamanhoTela);
    }
}