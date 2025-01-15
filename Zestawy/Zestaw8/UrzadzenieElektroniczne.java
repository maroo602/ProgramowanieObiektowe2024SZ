public abstract class UrzadzenieElektroniczne extends ProduktPrzemyslowy {
    public UrzadzenieElektroniczne(String nazwa, double cena, int ilosc){
        super(nazwa, cena, ilosc);
    }
    public abstract void napraw();
    public abstract void uzyj();
    public abstract void zepsuj();
    public abstract void wlacz();
    public abstract void wylacz();
}
