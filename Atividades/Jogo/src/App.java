import classes.PingPong;
import classes.VideoGame;

public class App {
    public static void main(String[] args) throws Exception {

        PingPong pingPong = new PingPong();
        VideoGame Mario = new VideoGame();
        Mario.ligar();
        Mario.jogar(new PingPong());
        Mario.fechar();

    }
}
