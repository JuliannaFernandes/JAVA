public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("João da Silva");
        conta.depositar(100);
        conta.sacar(30);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
