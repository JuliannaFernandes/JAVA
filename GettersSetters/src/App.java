import classes.Pessoa;
import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
       Pessoa pessoa = new Pessoa();
       //modificar -> setNomeVariavel
       //pegar -> getNomeVariavel
       
        pessoa.setNome("João");
        pessoa.setIdade(30);
        pessoa.setAltura(2.0);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        System.out.println(conta.getSaldo());
     
    }
}
