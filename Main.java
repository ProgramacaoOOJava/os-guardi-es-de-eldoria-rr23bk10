public class Main {

    public static void main(String[] args) {

        // Criação do primeiro personagem
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);

        // Criação do segundo personagem
        Personagem heroi2 = new Personagem("Lyra", "Arqueira", 3, 85, 14.2);

        // Exibe as informações dos personagens
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}