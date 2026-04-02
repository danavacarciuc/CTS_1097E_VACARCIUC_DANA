package factory.methodsingleton;

public class Cheesecake extends FelMancare {
    private Double gramaj;

    public Cheesecake(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Cheesecake: " + super.getDenumire() + ", " + this.gramaj + " grame");
    }
}