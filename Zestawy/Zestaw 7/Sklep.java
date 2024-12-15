import java.time.LocalDate;
import java.util.Objects;

class Sklep {
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, LocalDate dataPowstania, Magazyn magazynSklepu) {
        setNazwaSklepu(nazwaSklepu);
        setDataPowstania(dataPowstania);
        setMagazynSklepu(magazynSklepu);
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if (nazwaSklepu == null || nazwaSklepu.isEmpty()) {
            throw new IllegalArgumentException("Nazwa sklepu nie może być pusta.");
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        if (dataPowstania.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data powstania nie może być z przyszłości.");
        }
        this.dataPowstania = dataPowstania;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if (magazynSklepu == null) {
            throw new IllegalArgumentException("Magazyn sklepu nie może być null.");
        }
        this.magazynSklepu = magazynSklepu;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "nazwaSklepu='" + nazwaSklepu + '\'' +
                ", dataPowstania=" + dataPowstania +
                ", magazynSklepu=" + magazynSklepu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sklep sklep = (Sklep) o;
        return Objects.equals(nazwaSklepu, sklep.nazwaSklepu) && Objects.equals(dataPowstania, sklep.dataPowstania) && Objects.equals(magazynSklepu, sklep.magazynSklepu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaSklepu, dataPowstania, magazynSklepu);
}
}
