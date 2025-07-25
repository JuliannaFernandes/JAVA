public class Aluno{
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota1(double nota1){
        if(nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida. Digite um valor entre 0.0 e 10.0");
            return;
        }
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        if(nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida. Digite um valor entre 0.0 e 10.0");
            return; 
        }
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public void verificaAprovacao(){
        double media = calcularMedia();
        if(media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}