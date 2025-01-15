public class Osoba {

    private String imie;
    private String nazwisko;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {

        if(imie == null){
            throw new IllegalArgumentException("Imie nie może być pusty.");
        }
        this.imie = imie;
    }
    public String getNazwisko() {
        if(nazwisko == null){
            throw new IllegalArgumentException("Nazwisko nie może być pusty.");
        }

        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null){
            throw new IllegalArgumentException("Nazwisko nie może być pusty.");
        }
        this.nazwisko = nazwisko;
    }

    public Osoba(){
        imie="";
        nazwisko="";

    }
    public Osoba(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
}
