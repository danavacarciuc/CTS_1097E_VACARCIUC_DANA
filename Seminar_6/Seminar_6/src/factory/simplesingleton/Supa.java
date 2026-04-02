package factory.simplesingleton;

public abstract class Supa {
    private String denumire;

    public Supa(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public abstract void afiseazaDetalii();
}