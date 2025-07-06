import javax.swing.JOptionPane;

import classes.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do personagem:"); // Solicita o nome do personagem
        String classe = JOptionPane.showInputDialog("Digite a classe do personagem (Guerreiro/Mago):");
        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}