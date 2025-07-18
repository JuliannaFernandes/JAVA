package animais;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    public void latir () {
        System.out.printf("O %s está latindo.%n", getNome());
    }
    public void lamber () {
        System.out.printf("O %s está lambendo.%n", getNome());
    }
}
