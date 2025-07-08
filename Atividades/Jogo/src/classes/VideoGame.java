package classes;

public class VideoGame {
    private Jogo jogo;
    private boolean ligado;

    public void ligar() {
        System.out.println("Ligando o Video Game");
        this.ligado = true;
    }

    public void jogar(Jogo jogo) {
        if(ligado == true){
            System.out.println("Iniciando o jogo de Ping Pong");
            this.jogo = jogo;
            System.out.println("Iniciando o jogo no Video Game");
            jogo.jogar();
        }else {
            System.out.println("O Video Game está desligado. Ligue-o primeiro.");
        }
}
    public void fechar() {
        boolean temJogoRodando = jogo != null;

        if (temJogoRodando) {
            jogo.fechar();
            jogo = null;
        } else {
            System.out.println("Nenhum jogo está rodando no Video Game");
        }
    }
    
}