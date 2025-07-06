package classes;

import javax.swing.JOptionPane;

public class Personagem {
    //atributos da classe
    private String nome;
    private int nivel;
    private int vida;
    private int forca;
    private String classe;

    // construtor
    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10; // não é necessário colocar o this. pois não há ambiguidade
        vida = nivel * 100; 
        if(classe.equals("Guerreiro")){
            forca = nivel * 2;
        } else {
            forca = nivel * 1; 
        }
    }

    // métodos especificos
    public void mostrarStatus(){
        String status = String.format("Nome: %s\nClasse: %s\nNível: %d\nVida: %d\nForça: %d",
                this.nome,
                this.classe,
                this.nivel,
                this.vida,
                this.forca);
                JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }



    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    // métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    
}
