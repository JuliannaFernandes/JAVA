public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setNota1(5.0);
        aluno.setNota2(7.0);
        System.out.println("Média: " + aluno.calcularMedia());
        aluno.verificaAprovacao();
    }
}
