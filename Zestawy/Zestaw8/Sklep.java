import java.util.ArrayList;
import java.util.Date;

public class Sklep {
    private String nazwaSklepu;
    private Date dataPowstania;
    private Magazyn magazynSklepu;
    private ArrayList<Produkt> produkty = new ArrayList<>();

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public Date getDataPowstania() {
        return dataPowstania;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu == null){
            throw new IllegalArgumentException("Magazyn nie może być pusty.");
        }
        this.magazynSklepu = magazynSklepu;
    }

    public void setDataPowstania(Date dataPowstania) {
        if(dataPowstania == null){
            throw new IllegalArgumentException("Data nie może być pusty.");
        }
        this.dataPowstania = dataPowstania;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu == null){
            throw new IllegalArgumentException("Nazwa nie może być pusty.");
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }
    public void wyswietlOferty(){
        for (Produkt produkt : produkty) {
            System.out.println(produkt.getNazwa());
        }
    }
    public Produkt wyszukajProduktu(String nazwa){
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equals(nazwa)) {
                return produkt;
            }
        }
        return null;
    }
    public void zakupy(KoszykZakupowy koszyk, Produkt produkt, int ilosc){
        koszyk.dodajProdukt(produkt, ilosc);
    }
    public String getClass2() {
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }

    public Sklep(String nazwaSklepu, Date dataPowstania, Magazyn magazynSklepu) {
        if (dataPowstania.after(new Date())) {
            throw new IllegalArgumentException("Data powstania nie może być z przyszłości.");
        }
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }
}
