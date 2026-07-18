// Classe Mago herda de Personagem
public class Mago extends Personagem {

    // Atributo exclusivo
    private String magia;

    // Construtor
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, String magia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.magia = magia;
    }

    // Sobrescrita do método abstrato
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("🧙 Mago " + nome + " lança " + magia + "!");
    }
}