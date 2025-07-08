package classes;

public class TiroAoAlvoOnline implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Carregando o jogo ");
        System.out.println("Conectando ao servidor online");
    
    }

    @Override
    public void fechar() {
        System.out.println("Salvando o progresso do jogo no servidor");
        System.out.println("Fechando o jogo de Tiro ao Alvo");
    }
    
}
