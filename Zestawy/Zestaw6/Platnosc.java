import java.util.*;
class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac() {
        this.statusPlatnosci = "Opłacone";
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
