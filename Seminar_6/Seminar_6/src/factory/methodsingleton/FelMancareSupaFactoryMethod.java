package factory.methodsingleton;


import factory.simplesingleton.SupaCiuperci;
import factory.simplesingleton.SupaLegume;
import factory.simplesingleton.SupaVita;
import factory.simplesingleton.TipSupa;

public class FelMancareSupaFactoryMethod extends FelMancareFactoryMethod {
    private static FelMancareSupaFactoryMethod instanta = null;

    private FelMancareSupaFactoryMethod() {
    }

    public static synchronized FelMancareSupaFactoryMethod getInstanta() {
        if (FelMancareSupaFactoryMethod.instanta == null) {
            FelMancareSupaFactoryMethod.instanta = new FelMancareSupaFactoryMethod();
        }
        return FelMancareSupaFactoryMethod.instanta;
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tipFelMancare, String denumire) {
        return switch (tipFelMancare) {
            case TipSupa.LEGUME -> new SupaLegume(denumire);
            case TipSupa.CIUPERCI -> new SupaCiuperci(denumire);
            default -> throw new IllegalArgumentException("Tipul supei transmis nu există.");
        };
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tipFelMancare, String denumire, Double gramaj) {
        return switch (tipFelMancare) {
            case TipSupa.VITA -> new SupaVita(denumire, gramaj);
            default -> this.getFelMancare(tipFelMancare, denumire);
        };
    }
}