package classes;
public class Pessoa{

    private String nome="Julia";
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome; //utilizar o this para referenciar o atributo da classe
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade; // sem o this, o Java não saberia se você está se referindo ao atributo da classe ou ao parâmetro do método
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}
