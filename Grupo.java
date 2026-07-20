import java.util.ArrayList;
import java.util.Collections;

public class Grupo {

    private ArrayList<Personagem> membros;

    public Grupo() {
        membros = new ArrayList<>();
    }

    // Adiciona personagem ao grupo
    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    // Lista todos os personagens
    public void listarPersonagens() {
        for (Personagem p : membros) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println();
        }
    }

    // Realiza uma batalha entre dois personagens
    public void batalhar(Personagem a, Personagem b) {

        double poderA = a.getNivel() * a.getPoderBase();
        double poderB = b.getNivel() * b.getPoderBase();

        if (poderA > poderB) {
            System.out.println(a.getClasse() + " " + a.getNome()
                    + " venceu! Poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println(b.getClasse() + " " + b.getNome()
                    + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("Empate! Poder total: " + poderA);
        }
    }

    // Retorna a lista de membros
    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    // Ordena os personagens por nível
    public void ordenarPorNivel() {
        Collections.sort(membros);
    }
}