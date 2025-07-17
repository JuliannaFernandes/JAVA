import java.util.ArrayList;

public class Pessoa{
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibirNomesArrayList(ArrayList<Pessoa> pessoas) {
         for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
        }
    }
}