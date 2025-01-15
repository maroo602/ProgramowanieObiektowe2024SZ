import java.util.Optional;

public class Adres {
    private String ulica;
    private int numerDomu;
    private Optional<Integer> numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public String getUlica() {
        return ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null) {
            throw new IllegalArgumentException("Kod pocztowy nie może być pusty.");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public void setMiasto(String miasto) {if (miasto == null) {
        throw new IllegalArgumentException("Miasto nie może być pusty.");
    }
        this.miasto = miasto;
    }

    public void setNumerDomu(int numerDomu) {if (numerDomu == 0) {
        throw new IllegalArgumentException("Numer domu nie może być 0.");
    }
        this.numerDomu = numerDomu;
    }

    public void setNumerMieszkania(Optional<Integer> numerMieszkania) {if (numerMieszkania == null) {
        throw new IllegalArgumentException("Numer mieszkania nie może być pusty.");
    }
        this.numerMieszkania = numerMieszkania;
    }

    public void setUlica(String ulica) {if (ulica == null) {
        throw new IllegalArgumentException("Ulica nie może być pusty.");
    }
        this.ulica = ulica;
    }


    public void pokaz(){
        System.out.println(kodPocztowy);
        System.out.println(miasto+", "+ulica+" "+numerDomu+" "+numerMieszkania);
    }

    public boolean przed(Adres adres, Adres adres2){
        if(adres.kodPocztowy.equals(adres2.kodPocztowy)){
            return true;
        }
        return false;
    }



    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, int numerMieszkania,String Miasto ,String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerMieszkania = Optional.of(numerMieszkania);
    }

}
