public class Zamowienie {
    public KoszykZakupowy koszykZakupowy;
    public String statusZamowienia;
    public Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, Platnosc platnosc) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Przyjęte";  // Domyślny status
        this.platnosc = platnosc;
    }
    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Przyjęte";
        this.platnosc = new Platnosc(0.0);
    }

    public void ustawStatusZamowienia(String nowy) {
        this.statusZamowienia = nowy;
    }

    public void wyswietlZamowienie() {
        System.out.println("SZCZEGÓŁY ZAMÓWIENIA: ");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Wartość zamówienia: " + koszykZakupowy.obliczCalkowitaWartosc() + " zł");
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());
    }

    public void finalizujZamowienie() {
        if (platnosc.getStatusPlatnosci().equals("Opłacone")) {
            this.statusZamowienia = "Gotowe do wysyłki";
            System.out.println("Zamówienie zostało sfinalizowane.");
        } else {
            System.out.println("Płatność nie została opłacona.");
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc) {
        for (int i = 0; i < koszykZakupowy.produkty.size(); i++) {
            Produkt p = koszykZakupowy.produkty.get(i);
            if (p.nazwa.equals(produkt.nazwa)) {
                int iloscWKoszyku = koszykZakupowy.ilosci.get(i);
                if (ilosc <= iloscWKoszyku) {
                    p.dodajDoMagazynu(ilosc);
                    koszykZakupowy.ilosci.set(i, iloscWKoszyku - ilosc);
                    double kwotaDoOdjecia = produkt.cena * ilosc;
                    platnosc.kwota -= kwotaDoOdjecia;
                    System.out.println("Zwrócono " + ilosc + " produktów: " + produkt.nazwa);
                } else {
                    System.out.println("W koszyku nie ma wystarczającej ilości produktu do zwrotu.");
                }
                break;
            }
        }
    }
}
