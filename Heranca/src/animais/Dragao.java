package animais;

public class Dragao extends Ave {
    public Dragao(String nome) {
        super(nome);
    }
    public void soltarFogo() {
        System.out.printf("O %s está soltando fogo.%n", getNome());
    }
}
