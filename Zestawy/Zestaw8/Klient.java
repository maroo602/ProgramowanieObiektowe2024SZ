import java.util.ArrayList;
import java.util.Objects;

public class Klient extends Osoba
{
    private Adres adres;

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if(adres == null){
            throw new IllegalArgumentException("Adres nie może być pusty.");
        }
        this.adres = adres;
    }

    ArrayList<Zamowienie> listaZamowien = new ArrayList<>();

    public void dodajZamowienie(Zamowienie zamowienie){
        this.listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        for(int i = 0; i < listaZamowien.size(); i++){
            System.out.println(i);
            listaZamowien.get(i).wyswietlZamowienie();
        }
    }
    public void wyswietlLacznyKosztZamowien(){
        double suma = 0;
        for(Zamowienie z : listaZamowien){
            suma += z.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        System.out.println("Łączny koszt zamówień: "+suma);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko(), adres);
    }
    public boolean equals(Klient k, Klient k2){
        return Objects.equals(k.getImie(), k2.getImie()) && Objects.equals(k.getNazwisko(), k2.getNazwisko()) && Objects.equals(k.getAdres(), k2.getAdres());
    }
    public Klient(String imie, String nazwisko, Adres adres){
        super(imie, nazwisko);
        adres = adres;
    }
    public Klient(String imie, String nazwisko){
        super(imie, nazwisko);
    }
}
