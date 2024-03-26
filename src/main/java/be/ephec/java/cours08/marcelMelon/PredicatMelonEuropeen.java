package be.ephec.java.cours08.marcelMelon;

public class PredicatMelonEuropeen implements PredicatMelon {

    @Override
    public boolean test(Melon melon) {
        return melon != null && "Europe".equalsIgnoreCase(melon.getOrigine());
    }
}
