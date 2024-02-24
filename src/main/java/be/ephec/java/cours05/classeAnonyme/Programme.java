package be.ephec.java.cours05.classeAnonyme;

public class Programme {
    public static void main(String[] args) {
        Velo v1 = new Velo() {
            public void truc() {
                System.out.println("Truc");
            }

            @Override
            public void faireDuBruit() {
                System.out.println("Pouet pouet");
            }
        };

        Velo v2 = new Velo();

        v1.faireDuBruit();
        // v1.truc(); // Il n'y a pas de référence vers la méthode truc()
        // qui est définie dans la classe anonyme

        v2.faireDuBruit();
        // v2.truc();

        Velo v3 = new VeloQuiFaitPouetPouet();
        // v3 est déclaré de type Velo, donc n'a pas de méthode truc()
        // v3.truc();

        VeloQuiFaitPouetPouet v4 = new VeloQuiFaitPouetPouet();
        // v3 est déclaré de type VeloQuiFaitPouetPouet, donc  il a une méthode truc() !
        v4.truc();

    }
}
