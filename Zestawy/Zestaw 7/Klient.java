
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;
    private List<Zamowienie> zamowienia;

    public Klient(String imie, String nazwisko, Adres adres) {
        setImie(imie);
        setNazwisko(nazwisko);
        setAdres(adres);
        this.zamowienia = new ArrayList<>();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być puste.");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.isEmpty()) {
            throw new IllegalArgumentException("Nazwisko nie może być puste.");
        }
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być pusty.");
        }
        this.adres = adres;
    }

    public List<Zamowienie> getZamowienia() {
        return new ArrayList<>(zamowienia);
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        if (zamowienie == null) {
            throw new IllegalArgumentException("Zamówienie nie może być null.");
        }
        zamowienia.add(zamowienie);
    }

    public double obliczLacznyKosztZamowien() {
        return zamowienia.stream().mapToDouble(Zamowienie::obliczWartoscZamowienia).sum();
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres +
                ", zamowienia=" + zamowienia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return Objects.equals(imie, klient.imie) && Objects.equals(nazwisko, klient.nazwisko) && Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }
}
