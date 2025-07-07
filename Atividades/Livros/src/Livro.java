public class Livro{
    
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtores
    public Livro(){
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
    }

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    //métodos getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.format("Título: %s\nAutor: %s\nAno de Publicação: %d\n", 
                          titulo, autor, anoPublicacao);
    }
}