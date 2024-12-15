import java.util.Objects;

class Zamowienie {
    private KoszykZakupowy koszyk;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszyk, Platnosc platnosc) {
        setKoszyk(koszyk);
        setPlatnosc(platnosc);
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(KoszykZakupowy koszyk) {
        if (koszyk == null) {
            throw new IllegalArgumentException("Koszyk nie może być null.");
        }
        this.koszyk = koszyk;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if (platnosc == null) {
            throw new IllegalArgumentException("Płatność nie może być null.");
        }
        this.platnosc = platnosc;
    }

    public double obliczWartoscZamowienia() {
        return koszyk.obliczCalkowitaWartosc();
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "koszyk=" + koszyk +
                ", platnosc=" + platnosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zamowienie that = (Zamowienie) o;
        return Objects.equals(koszyk, that.koszyk) && Objects.equals(platnosc, that.platnosc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(koszyk, platnosc);
    }
}
