import java.util.ArrayList;

class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa + ", Cena: " + cena + ", Ilość na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc) {
        iloscNaMagazynie += ilosc;
        System.out.println("Nowa ilość na magazynie: " + iloscNaMagazynie);
    }

    public void usunZMagazynu(int ilosc) {
        if (iloscNaMagazynie < ilosc) {
            System.out.println("Za mała ilość na magazynie, nie można usunąć.");
        } else {
            iloscNaMagazynie -= ilosc;
            System.out.println("Nowa ilość na magazynie: " + iloscNaMagazynie);
        }
    }
}
