package MortalKombat;

public class KombatMortal {
    public static void main(String[] args) {
        Lutadores lutador[] = new Lutadores[6];
        lutador[0] = new Lutadores("Liu Kang", "Japão", 34, 1.79, 79.0, 15, 5, 8);
        lutador[0].apresentar();
        System.out.println("---------------------------------");
        lutador[1] = new Lutadores("Sub-Zero", "Noruega", 24, 1.80, 69.0, 50, 0, 10);
        lutador[1].apresentar();
        System.out.println("---------------------------------");
        lutador[2] = new Lutadores("Kung Lao", "Japão", 36, 1.82, 76.0, 18, 2, 7);
        lutador[2].apresentar();
        System.out.println("---------------------------------");
        lutador[3] = new Lutadores("Scorpion", "Dinamarca", 25, 1.79, 82.0, 48, 1, 10);
        lutador[3].apresentar();
        System.out.println("---------------------------------");
        lutador[4] = new Lutadores("Kabal", "Austria", 41, 1.76, 71.0, 21, 4, 7);
        lutador[4].apresentar();
        System.out.println("---------------------------------");
        lutador[5] = new Lutadores("Jax", "USA", 38, 1.87, 100.0, 25, 4, 9);
        lutador[5].apresentar();
        System.out.println("---------------------------------");


        lutador[0].perder();
    }
}


//Lutadores("Liu Kang", "USA", 34, 1.79, 79.0, 15, 5, 8);