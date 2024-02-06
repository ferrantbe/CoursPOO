package be.ephec.java.cours03.bankData;

public class Programme {
    public static void main(String[] args) {
        VisualiseurDeDonneesBancaires drv = new VisualiseurFricEnVrac();
        String result = drv.formaterDonnees();
        System.out.println(result);
    }
}
