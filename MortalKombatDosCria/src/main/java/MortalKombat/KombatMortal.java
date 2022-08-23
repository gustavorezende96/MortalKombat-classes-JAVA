package MortalKombat;

public class KombatMortal {
    public static void main(String[] args) {
        Lutadores l[] = new Lutadores[6];
        l[0] = new Lutadores("Liu Kang", "Japão", 34, 1.79, 79.0, 15, 5, 8);
        l[0].apresentar();
        System.out.println("---------------------------------");
        l[1] = new Lutadores("Sub-Zero", "Noruega", 24, 1.80, 69.0, 50, 0, 10);
        l[1].apresentar();
        System.out.println("---------------------------------");
        l[2] = new Lutadores("Kung Lao", "Japão", 36, 1.82, 76.0, 18, 2, 7);
        l[2].apresentar();
        System.out.println("---------------------------------");
        l[3] = new Lutadores("Scorpion", "Dinamarca", 25, 1.79, 69.0, 48, 1, 10);
        l[3].apresentar();
        System.out.println("---------------------------------");
        l[4] = new Lutadores("Kabal", "Austria", 41, 1.76, 71.0, 21, 4, 7);
        l[4].apresentar();
        System.out.println("---------------------------------");
        l[5] = new Lutadores("Jax", "USA", 38, 1.87, 100.0, 25, 4, 9);
        l[5].apresentar();
        System.out.println("---------------------------------");


        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[3]);
        UEC01.lutar();
        l[1].apresentar();
        l[3].apresentar();
    }
}


//Lutadores("Liu Kang", "USA", 34, 1.79, 79.0, 15, 5, 8);