
import java.util.Objects;

class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania; 
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this(ulica, numerDomu, null, miasto, kodPocztowy);
    }

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setNumerMieszkania(numerMieszkania);
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (ulica == null || ulica.isEmpty()) {
            throw new IllegalArgumentException("Ulica nie może być pusta.");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if (numerDomu == null || numerDomu.isEmpty()) {
            throw new IllegalArgumentException("Numer domu nie może być pusty.");
        }
        this.numerDomu = numerDomu;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null || miasto.isEmpty()) {
            throw new IllegalArgumentException("Miasto nie może być puste.");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null || kodPocztowy.isEmpty()) {
            throw new IllegalArgumentException("Kod pocztowy nie może być pusty.");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println("Ulica: " + ulica + ", nr domu: " + numerDomu + (numerMieszkania != null ? ", nr mieszkania: " + numerMieszkania : ""));
    }

    public boolean przed(Adres innyAdres) {
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy) < 0;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numerDomu='" + numerDomu + '\'' +
                ", numerMieszkania='" + (numerMieszkania != null ? numerMieszkania : "brak") + '\'' +
                ", miasto='" + miasto + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adres adres = (Adres) o;
        return Objects.equals(ulica, adres.ulica) && Objects.equals(numerDomu, adres.numerDomu) && Objects.equals(numerMieszkania, adres.numerMieszkania) && Objects.equals(miasto, adres.miasto) && Objects.equals(kodPocztowy, adres.kodPocztowy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ulica, numerDomu, numerMieszkania, miasto, kodPocztowy);
    }
}
