import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // criando métodos

    // void -> significa que o método não retorna nada
    void mostrarStatus() {
        System.out.format("Personagem: %s (level %d) com %d de força %n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
        int dado20Faces = gerador.nextInt(19) + 1; // gera um número aleatório entre 1 e 20
        int dano = forca + dado20Faces; // calcula o dano total
        return dano;
    }

    String gerarNome() {
            Random gerador = new Random();
            String[] nomes = {"Hércules", "Aquiles", "Perseu", "Teseu", "Ulisses"};
            int indice = gerador.nextInt(nomes.length);
            return nomes[indice];
        }

    String gerarHabilidade(){
        Random gerador = new Random();
        String[] habilidades = {"Golpe Poderoso", "Ataque Rápido", "Defesa Imbatível", "Fúria Selvagem", "Golpe Mágico"};
        int indice = gerador.nextInt(habilidades.length);
        return habilidades[indice];
    }

    // método atacar que recebe um parâmetro do tipo String
    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();
        String alvoAleatorio = gerarNome(); // chamando o método gerarNome para obter um nome aleatório
        String habilidadeAleatoria = gerarHabilidade(); // chamando o método gerarHabilidade para obter uma habilidade aleatória
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano!%n", nome, alvoAleatorio, danoCausado);
        } else {
            System.out.format("%s atacou %s com %s e causou %d de dano!%n", nome, alvoAleatorio, habilidadeAleatoria, danoCausado);
        }


       
    }
}