// Classe responsável por batalhas entre grupos
public class Arena {

    public void batalharGrupos(Grupo g1, Grupo g2) {

        g1.ordenarPorNivel();
        g2.ordenarPorNivel();

        int tamanho = Math.min(g1.getMembros().size(), g2.getMembros().size());

        System.out.println("===== INÍCIO DAS BATALHAS =====");

        for (int i = 0; i < tamanho; i++) {

            Personagem p1 = g1.getMembros().get(i);
            Personagem p2 = g2.getMembros().get(i);

            System.out.println();
            System.out.println(p1.getNome() + " VS " + p2.getNome());

            Grupo batalha = new Grupo();
            batalha.batalhar(p1, p2);
        }
    }
}