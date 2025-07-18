import animais.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.setNome("Rex");
        cachorro.latir();
        cachorro.lamber();

        Gato gato = new Gato("Mimi");
        gato.setNome("Mimi");
        gato.miar();
        gato.arranhar();
    }
}
