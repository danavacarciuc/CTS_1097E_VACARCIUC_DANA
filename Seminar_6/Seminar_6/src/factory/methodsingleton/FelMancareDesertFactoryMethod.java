package factory.methodsingleton;

public class FelMancareDesertFactoryMethod extends FelMancareFactoryMethod {
    private static FelMancareDesertFactoryMethod instanta = null;

    private FelMancareDesertFactoryMethod() {
    }

    public static synchronized FelMancareDesertFactoryMethod getInstanta() {
        if (FelMancareDesertFactoryMethod.instanta == null) {
            FelMancareDesertFactoryMethod.instanta = new FelMancareDesertFactoryMethod();
        }
        return FelMancareDesertFactoryMethod.instanta;
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tipFelMancare, String denumire) {
        return switch (tipFelMancare) {
            case TipDesert.PAPANASI -> new Papanasi(denumire);
            case TipDesert.CLATITE -> new Clatite(denumire);
            default -> throw new IllegalArgumentException("Tipul desertului transmis nu există.");
        };
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tipFelMancare, String denumire, Double gramaj) {
        return switch (tipFelMancare) {
            case TipDesert.CHEESECAKE -> new Cheesecake(denumire, gramaj);
            default -> this.getFelMancare(tipFelMancare, denumire);
        };
    }
}