import java.util.*;

public class Sanie {
    public static ArrayList<Renifer> renifery;

    public Sanie() {
        renifery = new ArrayList<>();
    }

    public void dodajRenifera(Renifer renifer) {
        renifery.add(renifer);
        System.out.println("Dodano renifera do zaprzegu: " + renifer.imie);
    }
    public void sumaPredkosci(){
        int suma=0;
        for(Renifer renifer : renifery){
            suma= suma+ renifer.predkosc;
        }
        System.out.print("Suma predkosci reniferow: "+suma);
    }


    @Override
    public String toString() {
        return "Sanie: " +
                "Renifery: " + renifery;
    }
    @Override
    public int hashCode() {
        return Objects.hash(renifery);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(renifery, Sanie.renifery);
    }

}