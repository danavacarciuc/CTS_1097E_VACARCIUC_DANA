package factory.methodsingleton;

import factory.simplesingleton.TipSupa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            FelMancareFactoryMethod felMancareSupaFactoryMethod = FelMancareSupaFactoryMethod.getInstanta();
            FelMancare supaLegume = felMancareSupaFactoryMethod.getFelMancare(TipSupa.LEGUME, "Supa de legume");
            FelMancare supaCiuperci = felMancareSupaFactoryMethod.getFelMancare(TipSupa.CIUPERCI, "Supa de ciuperci");
            FelMancare supaVita = felMancareSupaFactoryMethod.getFelMancare(TipSupa.VITA, "Supa de vita", 120.0);

            FelMancareFactoryMethod felMancareDesertFactoryMethod = FelMancareDesertFactoryMethod.getInstanta();
            FelMancare papanasi = felMancareDesertFactoryMethod.getFelMancare(TipDesert.PAPANASI, "Papanasi");
            FelMancare clatite = felMancareDesertFactoryMethod.getFelMancare(TipDesert.CLATITE, "Clatite");
            FelMancare cheesecake = felMancareDesertFactoryMethod.getFelMancare(TipDesert.CHEESECAKE, "Cheesecake", 200.0);

            List<FelMancare> feluriMancare = Arrays.asList(supaLegume, supaCiuperci, supaVita, papanasi, clatite, cheesecake);
            feluriMancare.forEach(FelMancare::afiseazaDetalii);
    }
}
