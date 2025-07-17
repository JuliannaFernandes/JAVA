import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Ana");
        Pessoa p2 = new Pessoa("Carlos");
        Pessoa p3 = new Pessoa("Beatriz");
        Pessoa p4 = new Pessoa("Daniel");

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

       pessoas.get(0).exibirNomesArrayList(pessoas);

        //busque o nome carlos e exclua se existir e exiba a lista atualizada
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals("Carlos")) {
                pessoas.remove(pessoa);
                System.out.println("Carlos foi removido da lista.");
                pessoas.get(0).exibirNomesArrayList(pessoas);
                break;
            }
            
        }        
    }
}
