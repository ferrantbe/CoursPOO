package be.ephec.java.cours08.marcelMelon;

public class PredicatMelonEnorme implements PredicatMelon {

    @Override
    public boolean test(Melon melon) {
        return melon != null && melon.getPoids() > 5000;
    }
}
