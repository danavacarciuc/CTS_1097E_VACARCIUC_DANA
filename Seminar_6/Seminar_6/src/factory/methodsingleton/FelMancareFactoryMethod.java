package factory.methodsingleton;

public abstract class FelMancareFactoryMethod {
    public abstract FelMancare getFelMancare(TipFelMancare tipFelMancare, String denumire);

    public abstract FelMancare getFelMancare(TipFelMancare tipFelMancare, String denumire, Double gramaj);
}