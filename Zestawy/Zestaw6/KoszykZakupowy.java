import java.util.*;

public class KoszykZakupowy {
    public ArrayList<Produkt> produkty;
    public ArrayList<Integer> ilosci;

    public KoszykZakupowy() {
        produkty = new ArrayList<>();
        ilosci = new ArrayList<>();

    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.iloscNaMagazynie >= ilosc) {
            produkty.add(produkt);
            ilosci.add(ilosc);
            produkt.usunZMagazynu(ilosc);
            System.out.println("Dodano produkt: " + produkt.nazwa + " Ilosc: " + ilosc);
        } else {
            System.out.println("Za mała ilość na magazynie.");
        }
    }

    public void wyswietlZawartoscKoszyka() {
        System.out.println("Zawartość: ");
        for (int i = 0; i < produkty.size(); i++) {
            Produkt p = produkty.get(i);
            int ilosc = ilosci.get(i);
            System.out.println("Produkt: " + p.nazwa + " Ilosc: " + ilosc);
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for (int i = 0; i < produkty.size(); i++) {
            Produkt p = produkty.get(i);
            int ilosc = ilosci.get(i);
            suma += Double.parseDouble(p.cena) * ilosc;
        }
        return suma;

    }
}
