public abstract class Warzywo extends ProduktSpozywczy{
    public Warzywo(String nazwa, double cena, int ilosc) {
        super(nazwa, cena, ilosc);
    }
    public abstract String smak();
    public abstract void umyj();
    public abstract void zjedz();
}
