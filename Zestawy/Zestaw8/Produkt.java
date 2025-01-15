import java.util.Objects;

class Produkt{
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;
    public String getNazwa(){
        return this.nazwa;
    }
    public double getCena(){
        return this.cena;
    }
    public int getIloscNaMagazynie(){
        return this.iloscNaMagazynie;
    }

    public void setCena(double cena) {
        if(cena == 0){
            throw new IllegalArgumentException("Cena nie może być 0.");
        }
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null){
            throw new IllegalArgumentException("Nazwa nie może być pusty.");
        }
        this.nazwa = nazwa;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if(iloscNaMagazynie < 0){
            throw new IllegalArgumentException("Ilosc na magazynie nie moze byc ujemna.");
        }
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Szczegóły produktu: ");
        System.out.printf("Nazwa: %s\n", getNazwa());
        System.out.printf("Cena: %f\n", getCena());
        System.out.printf("Ilość na magazynie: %d\n", getIloscNaMagazynie());
    }
    public void dodajDoMagazynu(int ilosc){
        this.iloscNaMagazynie += ilosc;
    }
    public void usunZMagazynu(int ilosc){
        if(this.iloscNaMagazynie-ilosc > 0){
        this.iloscNaMagazynie -= ilosc;
        }
    }
    public boolean equals(Produkt produkt, Produkt produkt2){
        return Objects.equals(produkt.getNazwa(), produkt2.getNazwa()) && Objects.equals(produkt.getCena(), produkt2.getCena());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }
    public Produkt(){
        nazwa="";
        cena=0;
        iloscNaMagazynie=0;
    }
    public Produkt(String nazwa,double cena,int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
}
