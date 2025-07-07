public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro();
        livro1.exibirDetalhes();

        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        livro2.exibirDetalhes();
    }
}
