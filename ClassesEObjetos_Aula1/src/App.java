public class App {
    public static void main(String[] args) throws Exception { // método main chamado ao iniciar a aplicação Java
        // Criação de um objeto da classe Celular
        Celular celular1 = new Celular();

        celular1.nome = "Samsung Galaxy S21"; 
        celular1.tamanhoTela = 6.2f;
        celular1.sistemaOperacional = "Android 11"; 
        celular1.espacoArmazenamento = 128; 

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s\n", celular1.nome, celular1.tamanhoTela, celular1.espacoArmazenamento, celular1.sistemaOperacional);

        Celular celular2 = new Celular();
        celular2.nome = "iPhone 12";
        celular2.tamanhoTela = 6.1f;
        celular2.sistemaOperacional = "iOS 14";
        celular2.espacoArmazenamento = 64;
        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s\n", celular2.nome, celular2.tamanhoTela, celular2.espacoArmazenamento, celular2.sistemaOperacional);

        celular1.ligar(); 
        celular2.calcularEspacoDisponivel(20);
    }


}
