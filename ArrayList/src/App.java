import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa joao = new Pessoa("João", 25);
        Pessoa maria = new Pessoa("Maria", 30);
        Pessoa pedro = new Pessoa("Pedro", 20);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
        }

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        // adicionnado numero aleatorio
        numeros.add(10);
        numeros.add(20);
        numeros.add(-40);

        // sort -> ordenar  
        Collections.sort(numeros, Collections.reverseOrder()); // ordena em ordem decrescente
        Collections.sort(numeros); // ordena em ordem crescente
    
    }
}
