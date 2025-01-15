import java.util.Objects;

public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        if (koszykZakupowy == null) {
            throw new IllegalArgumentException("KoszykZakupowy nie może być pusty.");
        }
        this.koszykZakupowy = koszykZakupowy;
    }

    enum statusy{
        Przyjete,
        Realizacja,
        GotoweDoWysyłki,
        Wyslane,
        Dostarczone
    }



    public statusy getStatus() {
        return status;
    }

    public void setStatus(statusy status) {
        this.status = status;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
    }

    private statusy status;
    private Platnosc platnosc;

    public void ustawStatusZamowienia(statusy status){
        this.status = status;
    }
    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlZawartosckoszyka();
        System.out.println("Status: " + status);
    }
    public void finalizujZamowienie(){
        if(Objects.equals(platnosc.getStatusPlatnosci(), "Opłacone")) this.ustawStatusZamowienia(statusy.GotoweDoWysyłki);
    }
    public void zwrocProdukt(Produkt produkt, int ilosc){
        produkt.dodajDoMagazynu(ilosc);
        koszykZakupowy.usunProdukt(produkt.getNazwa());
        System.out.println(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public Zamowienie(KoszykZakupowy kps, statusy status, Platnosc platnosc) {
        this.koszykZakupowy = kps;
        this.status = status;
        this.platnosc=platnosc;
    }
}
