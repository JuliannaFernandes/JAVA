public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido para depósito."); 
        }else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        }
    }

    public void sacar(double valor){
        if(valor > saldo || valor <= 0){
            System.out.println("Saque não permitido.");
        }
        else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        }
    }

}