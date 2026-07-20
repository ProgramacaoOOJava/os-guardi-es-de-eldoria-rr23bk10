// Classe abstrata que servirá como base para todos os personagens
public abstract class Personagem implements Comparable<Personagem> {

    // Atributos comuns
    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    // Construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Exibe os dados do personagem
    public void exibirStatus() {
        System.out.println("===============================");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Método abstrato
    public abstract void usarHabilidadeEspecial();

    // Getters
    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Comparable (ordena por nível)
    @Override
    public int compareTo(Personagem outro) {
        return Integer.compare(this.nivel, outro.nivel);
    }
}s