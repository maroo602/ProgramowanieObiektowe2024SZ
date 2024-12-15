class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;

    public Klient(String imie, String nazwisko, Adres adres) {
        setImie(imie);
        setNazwisko(nazwisko);
        setAdres(adres);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Klient klient = (Klient) obj;
        return Objects.equals(imie, klient.imie) &&
               Objects.equals(nazwisko, klient.nazwisko) &&
               Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    @Override
    public String toString() {
        return "Imię: " + imie + ", Nazwisko: " + nazwisko + "\nAdres:\n" + adres;
    }
}
