public class KlientIndywidualny extends Klient {
    private String PESEL;

    public KlientIndywidualny(String imie, String nazwisko, String PESEL){
        super(imie, nazwisko);
        PESEL=PESEL;
    }
}
