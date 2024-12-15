
import java.util.Objects;

class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        setNazwa(nazwa);
        setCena(cena);
        setIloscNaMagazynie(iloscNaMagazynie);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa produktu nie może być pusta.");
        }
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena < 0) {
            throw new IllegalArgumentException("Cena nie może być ujemna.");
        }
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if (iloscNaMagazynie < 0) {
            throw new IllegalArgumentException("Ilość na magazynie nie może być ujemna.");
        }
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void dodajDoMagazynu(int ilosc) {
        setIloscNaMagazynie(this.iloscNaMagazynie + ilosc);
    }

    public void usunZMagazynu(int ilosc) {
        if (ilosc > this.iloscNaMagazynie) {
            throw new IllegalArgumentException("Za mała ilość na magazynie, nie można usunąć.");
        }
        setIloscNaMagazynie(this.iloscNaMagazynie - ilosc);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", iloscNaMagazynie=" + iloscNaMagazynie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.cena, cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }
}
