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

        Celular celularB = new Celular(); // objeto celularB
        celularB.nome = "iPhone 12"; // com o estado de nome definido como "iPhone 12"
        celularB.sistemaOperacional = "iOS"; // com o estado de sistemaOperacional definido como "iOS"
        celularB.armazenamento = 128; // com o estado de armazenamento definido como 128
        celularB.tamanhoTela = 6.9f;  // com o estado de tamanhoTela definido como 6.9"

        System.out.format("Celular %s com sistema operacional %s com armazenamento de %d GB e tamanho da tela %.1f\"\n", celularA.nome, celularA.sistemaOperacional, celularA.armazenamento, celularA.tamanhoTela);
        System.out.format("Celular %s com sistema operacional %s com armazenamento de %d GB e tamanho da tela %.1f\"\n", celularB.nome, celularB.sistemaOperacional, celularB.armazenamento, celularB.tamanhoTela);
    }
}