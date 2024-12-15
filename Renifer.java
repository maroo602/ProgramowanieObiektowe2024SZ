import java.util.*;
public class Renifer {
    String imie;
    int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
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
    public void setPredkosc(int predkosc) {
        if (predkosc<0 ) {
            throw new IllegalArgumentException("Predkosc nie może być ujemna.");
        }
        this.predkosc = predkosc;
    }
    public int getPredkosc() {
        return predkosc;
    }
public void nakarmRenifera(){
        System.out.print("Nakarmiono renifera: "+ imie);
        predkosc=predkosc+5;
}
    public void wyswietlInformacje() {
        System.out.println("Predkosc renifera "+ imie +": "+predkosc);
    }

    @Override
    public String toString() {
        return "Imie: "+ imie+ "Predkosc: " + predkosc;
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renifer renifer=(Renifer)o;
        return Objects.equals(imie, renifer.imie);
    }
}
