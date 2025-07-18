package animais;

public class Animal {
    private String nome;

    public void comer() {
        System.out.format("O %s está comendo.%n", nome);
    }

    public void beber() {
        System.out.format("O %s está bebendo.%n", nome);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public Animal(String nome){
        this.nome = nome;
    }

  
}
