package PrivateandPublic;
public class App {
    public static void main(String[] args) throws Exception {
        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirSerie("Stranger Things");
    }
}