import java.util.Objects;

public class Platnosc {
    private double Kwota;

    public double getKwota() {
        return Kwota;
    }

    public void setKwota(double kwota) {
        if(kwota == 0){
            throw new IllegalArgumentException("Kwota nie może być 0.");
        }
        Kwota = kwota;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci == null){
            throw new IllegalArgumentException("Status nie może być pusty.");
        }
        this.statusPlatnosci = statusPlatnosci;
    }

    private String statusPlatnosci;

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
    public boolean equals(Platnosc p, Platnosc p2){
        return Objects.equals(p.getKwota(), p2.getKwota()) && Objects.equals(p.getStatusPlatnosci(),p2.getStatusPlatnosci());
    }
    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.Kwota = 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Kwota, statusPlatnosci);
    }
    public Platnosc(double Kwota, String status) {
        this.Kwota = Kwota;
        this.statusPlatnosci = status;
    }
}
