

1. Klasa dziedziczy po innej klasie.


2. Posiada prywatne pola.


3. Posiada odpowiednie gettery i settery.



Kod:

// Klasa bazowa
class Osoba {
    private String imie;
    private String nazwisko;

    // Konstruktor
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    // Gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    // Settery
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}

// Klasa dziedzicząca
class Pracownik extends Osoba {
    private String stanowisko;
    private double wynagrodzenie;

    // Konstruktor
    public Pracownik(String imie, String nazwisko, String stanowisko, double wynagrodzenie) {
        super(imie, nazwisko); // Wywołanie konstruktora klasy bazowej
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    // Getter i setter dla stanowiska
    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    // Getter i setter dla wynagrodzenia
    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        if (wynagrodzenie > 0) {
            this.wynagrodzenie = wynagrodzenie;
        } else {
            System.out.println("Wynagrodzenie musi być większe od zera!");
        }
    }
}

// Przykład użycia
public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", "Programista", 10000.0);

        // Wyświetlanie danych pracownika
        System.out.println("Imię: " + pracownik.getImie());
        System.out.println("Nazwisko: " + pracownik.getNazwisko());
        System.out.println("Stanowisko: " + pracownik.getStanowisko());
        System.out.println("Wynagrodzenie: " + pracownik.getWynagrodzenie());

        // Aktualizacja wynagrodzenia
        pracownik.setWynagrodzenie(12000.0);
        System.out.println("Nowe wynagrodzenie: " + pracownik.getWynagrodzenie());
    }


import java.util.ArrayList;
import java.util.List;

class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek; // Pole przechowujące wiek

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", wiek: " + wiek;
    }
}

class Pracownik extends Osoba {
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        super(imie, nazwisko, wiek);
        this.stanowisko = stanowisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie listy pracowników
        List<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik("Jan", "Kowalski", 45, "Programista"));
        pracownicy.add(new Pracownik("Anna", "Nowak", 50, "Projektant"));
        pracownicy.add(new Pracownik("Piotr", "Zieliński", 38, "Tester"));
        pracownicy.add(new Pracownik("Maria", "Wiśniewska", 60, "Manager"));

        // Szukanie najstarszego pracownika
        Pracownik najstarszy = null;
        for (Pracownik pracownik : pracownicy) {
            if (najstarszy == null || pracownik.getWiek() > najstarszy.getWiek()) {
                najstarszy = pracownik;
            }
        }

        // Wyświetlenie najstarszego pracownika
        if (najstarszy != null) {
            System.out.println("Najstarszy pracownik: " + najstarszy);
        } else {
            System.out.println("Lista pracowników jest pusta.");
        }
    }
}
