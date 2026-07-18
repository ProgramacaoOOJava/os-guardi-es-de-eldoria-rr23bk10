import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Lista de personagens (polimorfismo)
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Instanciando objetos das subclasses
        personagens.add(new Guerreiro("Arthus", 5, 150, 22.5, "Espada"));
        personagens.add(new Mago("Elenara", 7, 90, 35.8, "Bola de Fogo"));

        // Percorrendo a lista
        for (Personagem personagem : personagens) {

            personagem.exibirStatus();

            // Chamada polimórfica
            personagem.usarHabilidadeEspecial();

            System.out.println();
        }
    }
}