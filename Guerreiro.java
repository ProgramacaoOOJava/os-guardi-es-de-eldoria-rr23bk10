// Classe Guerreiro herda de Personagem
public class Guerreiro extends Personagem {

    // Atributo exclusivo
    private String arma;

    // Construtor
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, String arma) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.arma = arma;
    }

    // Sobrescrita do método abstrato
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("⚔ Guerreiro " + nome + " ataca com " + arma + " Flamejante!");
    }
}