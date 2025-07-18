package animais;

//gato é uma subclasse de Animal e Animal é a superclasse de Gato
public class Gato extends Animal{
    public Gato(String nome){
        super(nome); //chama o construtor da superclasse Animal
    }
    public void miar(){
        System.out.printf("O %s está miando.%n", getNome());
    }
    public void arranhar(){
        System.out.printf("O %s está arranhando.%n", getNome());
    }
}