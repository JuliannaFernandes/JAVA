package classes;

public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Exibir tabuleiro de xadrez");
        System.out.println("Exibir peças de xadrez");
    }

    @Override
    public void fechar() {
        System.out.println("Fechar o jogo de xadrez");
    }
    
}
