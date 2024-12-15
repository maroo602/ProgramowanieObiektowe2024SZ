import java.util.*;

class Elf {
     String imie;
     int wiek;
     String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    public void setImie(String imie) {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być puste.");
        }
        this.imie = imie;
    }
    public String getImie() {
        return imie;
    }

    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko+".");
    }
    @Override
    public String toString() {
        return "Imie: "+ imie+ "Wiek: " + wiek+" Stanowisko: "+ stanowisko;
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Elf elfiska = (Elf) o;
//        return Objects.equals(imie,Elf.imie) && Objects.equals(wiek, Elf.wiek) && Objects.equals(stanowisko, Elf.stanowisko);
//    }
}