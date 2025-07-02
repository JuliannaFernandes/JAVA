public class ContaNetflix {
    private String idioma;
    private String resolucao;

    public void entrar(){
        buscarPreerenciasDoUsuario();
        identificarResolucao();
    }

    private void buscarPreerenciasDoUsuario() {
        idioma = "PT-BR";
    }

    private void identificarResolucao() {
        resolucao = "4K";
    }

    public void assistirFilme(String nomeFilme) {
        System.out.println("Assistindo o filme: " + nomeFilme);
        System.out.println("Carregando o filme na resolução: " + resolucao);
        carregarAudio();
    }

    private void carregarAudio(){
        if(idioma == "PT-BR" || idioma == "EN-US") {
            System.out.println("Carregando áudio em " + idioma);
        } else {
            System.out.println("Carregando áudio em EN-US");
        }
    }
}
