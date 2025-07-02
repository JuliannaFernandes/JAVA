import java.util.Random;

public class Celular{

    // atributos da classe Celular

    String nome; // nome do celular
    String sistemaOperacional; // sistema operacional do celular
    int espacoArmazenamento; // espaço de armazenamento do celular em GB
    float tamanhoTela; // tamanho da tela do celular em polegadas

    void ligar(){
        String nomecelular = geradorCelular();
        if (nome == null || nome.isEmpty()) {
            nome = geradorCelular();
        } else{
            System.out.format("Ligando o celular %s...\n", nomecelular);
        }
    }

    int calcularEspacoDisponivel(int espacoUsado){
        int espacoDisponivel = espacoArmazenamento - espacoUsado;
        System.out.format("Espaço disponível: %dGB\nEspaço usado: %dGB\n", espacoDisponivel, espacoUsado);
        return espacoDisponivel;
    }

    String geradorCelular(){
        Random rand = new Random();
        String[] nomes = {"Samsung Galaxy S21", "iPhone 12", "Xiaomi Mi 11", "OnePlus 9", "Google Pixel 5"};
        int indice = rand.nextInt(nomes.length); // gera um índice aleatório para escolher um nome de celular
        return nomes[indice];
    }
}