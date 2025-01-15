import java.util.ArrayList;
import java.util.Objects;

public class KoszykZakupowy {
    private static class ProduktWKoszyku{
        Produkt produkt;
        int ilosc;

        public ProduktWKoszyku(Produkt produkt, int ilosc){
            this.produkt = produkt;
            this.ilosc = ilosc;
        }
        public double wartosc(){
            return produkt.getCena()*ilosc;
        }
        public void wyswietlInformacje(){
            System.out.println("nazwa: "+produkt.getNazwa()+" cena: "+produkt.getCena()+" ilosc: "+ilosc);
        }
    }

    private ArrayList<ProduktWKoszyku> produkty = new ArrayList<>();

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkt.getIloscNaMagazynie() -ilosc>=0) {
            produkty.add(new ProduktWKoszyku(produkt, ilosc));
            produkt.usunZMagazynu(ilosc);
        }
    }
    public void usunProdukt(String nazwa) {
        produkty.removeIf(produkt -> Objects.equals(produkt.produkt.getNazwa(), nazwa));
    }
    public void wyswietlZawartosckoszyka(){
        System.out.println("Zawartosc koszyka:");
        for(ProduktWKoszyku produkt : produkty){
            produkt.wyswietlInformacje();
        }
    }
    public double obliczCalkowitaWartosc(){
        double wartosc = 0;
        for(ProduktWKoszyku ProduktWKoszyku : produkty){
            wartosc += ProduktWKoszyku.wartosc();
        }
        return wartosc;
    }
    public KoszykZakupowy() {
        this.produkty = new ArrayList<>();
    }
}
