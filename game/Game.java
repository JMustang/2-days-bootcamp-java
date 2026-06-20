package game;

public class Game {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.nome = "Arthas";
        heroi.classe = "Cavaleiro da Morte";
        heroi.magia = "Golpe de Gelo";
        heroi.atk_fisico = 150;
        heroi.atk_magico = 100;
        heroi.hp = 1000;
        heroi.mp = 500;

        Monstro monstro = new Monstro();
        monstro.nome = "Lich King";
        monstro.tipo = "Chefe Final";
        monstro.atk_fisico = 200;
        monstro.atk_magico = 300;
        monstro.hp = 2000;

        System.out.println("Herói: " + heroi.nome);
        System.out.println("Classe: " + heroi.classe);
        System.out.println("Magia: " + heroi.magia);
        System.out.println("Ataque Físico: " + heroi.atk_fisico);
        System.out.println("Ataque Mágico: " + heroi.atk_magico);
        System.out.println("HP: " + heroi.hp);
        System.out.println("MP: " + heroi.mp);

        System.out.println("\nMonstro: " + monstro.nome);
        System.out.println("Tipo: " + monstro.tipo);
        System.out.println("Ataque Físico: " + monstro.atk_fisico);
        System.out.println("Ataque Mágico: " + monstro.atk_magico);
        System.out.println("HP: " + monstro.hp);
    }
}
