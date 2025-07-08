package classes;

public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Jogando Ping Pong");
        System.out.println("Mostrando o menu incial");
        System.out.println("Tocando musica de fundo");
    }

    @Override
    public void fechar() {
        System.out.println("Salvando o jogo Ping Pong");
        System.out.println("Fechando o jogo Ping Pong");
    
    }
    
}
