package factory.methodsingleton;

public class Clatite extends FelMancare {
    public Clatite(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Clatite: " + super.getDenumire());
    }
}