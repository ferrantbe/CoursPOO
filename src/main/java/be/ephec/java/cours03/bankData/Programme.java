package be.ephec.java.cours03.bankData;

public class Programme {
    public static void main(String[] args) {
        DataReportVisualizer drv = new DRVFricEnVrac();
        String result = drv.formatData();
        System.out.println(result);
    }
}
