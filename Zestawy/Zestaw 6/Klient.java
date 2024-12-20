import java.util.*;
class Klient {
    String imie;
    String nazwisko;
    public ArrayList<Zamowienie> zamowienia;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zamowienia = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        zamowienia.add(zamowienie);
    }

    public void wyswietlHistorieZamowien() {
        System.out.println("Klient: " + imie + " " + nazwisko);
        System.out.println("Historia zamówień:");
        for (int i = 0; i < zamowienia.size(); i++) {
            zamowienia.get(i).wyswietlZamowienie();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double lacznyKoszt = 0;
        for (int i = 0; i < zamowienia.size(); i++) {
            lacznyKoszt += zamowienia.get(i).koszykZakupowy.obliczCalkowitaWartosc();
        }
        return lacznyKoszt;
    }
}
