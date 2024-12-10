import java.util.*;
class Sklep {
    private ArrayList<Produkt> produkty;

    public Sklep() {
        produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wyswietlOferty() {
        System.out.println("Produkty w sklepie:");
        for (Produkt produkt : produkty) {
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProdukt(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.nazwa.equals(nazwa)) {
                return produkt;
            }
        }
        return null;
    }
}
