package classes;    

public class Pessoa{
    private String nome;
    private int idade;
    private float altura;

    //Método construtor
    public Pessoa(String nome, int idade, float altura){
        System.out.println("Mais uma pessoa nasceu!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.format("Nome: %s\nIdade: %d\nAltura: %.2fm\n",
                this.nome,
                this.idade,
                this.altura);
    }

    //métodos Getters e setters 

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
        
    
}