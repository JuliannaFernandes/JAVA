public class App {
    public static void main(String[] args) throws Exception { // método main chamado ao iniciar o projeto
    Personagem heroi = new Personagem();
    heroi.nome = "Hércules";
    heroi.nivel = 3;
    heroi.forca = 20;

    heroi.mostrarStatus(); // chamando o método mostrarStatus do objeto heroi
    heroi.atacar("Monstro", "Golpe Poderoso"); // chamando o método atacar do objeto heroi e passando um argumento
    }
} 
