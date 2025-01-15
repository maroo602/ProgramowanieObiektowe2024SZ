public abstract class Ubranie extends ProduktPrzemyslowy{

    public Ubranie(String nazwa, double cena, int ilosc){
        super(nazwa, cena, ilosc);
    }
    public abstract void wypierz();
    public abstract void zaloz();
    public abstract void wyprasuj();
    public abstract void wysusz();
    public abstract void zniszcz();
}
