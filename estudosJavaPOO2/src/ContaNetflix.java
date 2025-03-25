public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        buscarPreferenciaDoUsuario();
        identificarResolucaoTela();
        System.out.println("Entrando na conta Netflix");
    }

    private void buscarPreferenciaDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }

    private void identificarResolucaoTela(){
        resolucaoTela = "Full HD";
    }

    public void assistirSerie(String nomeSerie){
        System.out.println("Assistindo série: " + nomeSerie);
        System.out.println("Carregando o filme na resolução: " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("Carregando áudio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando áudio em EN-US");
        }
    }
}
