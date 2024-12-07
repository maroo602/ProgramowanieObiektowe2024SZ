import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    public ArrayList<Zamowienie> zamowienia;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        zamowienia = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        zamowienia.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        System.out.println("Klient: " + imie + " " + nazwisko);
        System.out.println("Historia zamowien: ");
        for(int i=0; i<zamowienia.size(); i++){
            zamowienia.get(i).wyswietlZamowienie();
        }
    }
    public double obliczLaczyKosztZamowien(){
        double lacznykoszt=0;
        for(int i=0; i<zamowienia.size(); i++){
            lacznykoszt+=;
        }
        return lacznykoszt;
    }
}
