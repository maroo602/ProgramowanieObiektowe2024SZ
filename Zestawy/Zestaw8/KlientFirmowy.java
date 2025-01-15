public class KlientFirmowy extends Klient{
    private String NIP;
    private String REGON;

    public KlientFirmowy(String imie, String nazwisko, String NIP, String REGON){
        super(imie, nazwisko);
        NIP=NIP;
        REGON=REGON;

    }
}
