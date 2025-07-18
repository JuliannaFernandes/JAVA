package animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 4; // Inicializa o contador de cartas enviadas
    }

    public void fazerPru(){
        System.out.printf("O %s está fazendo pru.%n", getNome());
    }
   
    public void enviarCarta() {
        cartasEnviadas++;
        System.out.printf("O %s está enviando uma carta. Total de cartas enviadas: %d%n", getNome(), cartasEnviadas);
    }

}
