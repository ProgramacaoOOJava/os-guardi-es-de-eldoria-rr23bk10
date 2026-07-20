public class Main {

    public static void main(String[] args) {

        Grupo grupo1 = new Grupo();
        Grupo grupo2 = new Grupo();

        grupo1.adicionarPersonagem(
                new Guerreiro("Arthus", 5, 150, 22.5, "Espada"));

        grupo1.adicionarPersonagem(
                new Guerreiro("Leon", 8, 180, 30.0, "Machado"));

        grupo2.adicionarPersonagem(
                new Mago("Elenara", 7, 90, 35.8, "Bola de Fogo"));

        grupo2.adicionarPersonagem(
                new Mago("Merlin", 9, 100, 32.0, "Raio Arcano"));

        System.out.println("=== GRUPO 1 ===");
        grupo1.listarPersonagens();

        System.out.println("=== GRUPO 2 ===");
        grupo2.listarPersonagens();

        Arena arena = new Arena();

        arena.batalharGrupos(grupo1, grupo2);
    }
}