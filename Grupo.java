import java.util.ArrayList;
import java.util.Collections;

// Representa um grupo de personagens
public class Grupo {

    private ArrayList<Personagem> membros;

    public Grupo() {
        membros = new ArrayList<>();
    }

    // Adiciona personagem
    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    // Lista os personagens
    public void listarPersonagens() {
        for (Personagem p : membros) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println();
        }
    }

    // Realiza uma batalha
    public void batalhar(Personagem a, Personagem b) {

        double poderA = a.getNivel() * a.getPoderBase();
        double poderB = b.getNivel() * b.getPoderBase();

        if (poderA > poderB) {
            System.out.println(a.getClasse().replace("", "") + " " + a.getNome()
                    + " venceu! Poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println(b.getClasse().replace("", "") + " " + b.getNome()
                    + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("Empate! Poder total: " + poderA);
        }
    }

    // Retorna os membros
    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    // Ordena por nível
    public void ordenarPorNivel() {
        Collections.sort(membros);
    }
}