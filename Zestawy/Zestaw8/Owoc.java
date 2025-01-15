public abstract class Owoc extends ProduktSpozywczy{
    public Owoc(String nazwa, double cena, int ilosc) {
        super(nazwa, cena, ilosc);
    }
    public abstract String smak();
    public abstract void umyj();
    public abstract void zjedz();
}
