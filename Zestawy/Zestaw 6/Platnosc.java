class Platnosc {
    public double kwota;
    public String statusPlatnosci;

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

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }
}
