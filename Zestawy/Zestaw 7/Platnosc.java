import java.util.Objects;

class Platnosc {
    private double kwota;
    private String status;

    public Platnosc(double kwota, String status) {
        setKwota(kwota);
        setStatus(status);
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if (kwota < 0) {
            throw new IllegalArgumentException("Kwota nie może być ujemna.");
        }
        this.kwota = kwota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Status nie może być pusty.");
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return "Platnosc{" +
                "kwota=" + kwota +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(platnosc.kwota, kwota) == 0 && Objects.equals(status, platnosc.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, status);
    }
}
