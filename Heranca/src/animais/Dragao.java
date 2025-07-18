package animais;

public class Dragao extends Animal {
    public Dragao(String nome) {
        super(nome);
    }
    public void soltarFogo() {
        System.out.printf("O %s está soltando fogo.%n", getNome());
    }
    public void voar(){
        System.out.printf("O %s está voando.%n", getNome());
    }
}
