import java.util.*;
public class Fabryka {
    int dlGeo;
    int szGeo;
    public ArrayList<Elf> elfy;
    public Fabryka(){
        elfy=new ArrayList<>();
    }
    public void setDlGeo(int dlGeo) {
        if ((dlGeo < -180) || dlGeo > 180 ) {
            throw new IllegalArgumentException("Błąd.");
        }
        this.dlGeo = dlGeo;
    }
    public int getDlGeo() {
        return dlGeo;
    }
    public void setSzGeo(int szGeo) {
        if ((szGeo < -90 || szGeo > 90)) {
            throw new IllegalArgumentException("Błąd.");
        }
        this.szGeo = szGeo;
    }
    public int getSzGeo() {
        return szGeo;
    }
    public void dodajPracownika(Elf elf){
        elfy.add(elf);
        System.out.println("Dodano elfa: "+ elf.imie);
    }
    public void usunPracownika(Elf elf){
        elfy.remove(elf);
        System.out.println("Usunieto elfa: "+ elf.imie);
    }
    @Override
    public String toString() {
        return "Dlugosc geograficznaL "+ dlGeo+" Szerokosc geograficzna: "+szGeo;
    }
    @Override
    public int hashCode() {
        return Objects.hash(dlGeo, szGeo, elfy);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fabryka fabryka = (Fabryka) o;
//        return Objects.equals(dlGeo, Fabryka.dlGeo);
//    }
}
