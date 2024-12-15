import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produkt kolo = new Produkt("Kolo", 150.50, 100);
        Produkt felga = new Produkt("Felga", 300.20, 50);
        Produkt olej = new Produkt("Olej", 50.0, 30);

        System.out.println("Test: Wyświetlanie produktów:");
        kolo.wyswietlInformacje();
        felga.wyswietlInformacje();
        olej.wyswietlInformacje();

        System.out.println("\nTest: Dodawanie do magazynu:");
        kolo.dodajDoMagazynu(20);
        kolo.wyswietlInformacje();

        System.out.println("\nTest: Usuwanie z magazynu:");
        kolo.usunZMagazynu(50);
        kolo.wyswietlInformacje();

        Magazyn magazyn = new Magazyn();
        Sklep sklep = new Sklep("AutoPartnerxd", LocalDate.of(2020, 1, 1), magazyn);
        magazyn.dodajProdukt(kolo);
        magazyn.dodajProdukt(felga);
        magazyn.dodajProdukt(olej);

        System.out.println("\nTest: Wyświetlanie oferty sklepu:");
        magazyn.wyswietlOferty();

        KoszykZakupowy koszyk = new KoszykZakupowy();
        System.out.println("\nTest: Dodawanie produktów do koszyka:");
        koszyk.dodajProdukt(kolo, 10);
        koszyk.dodajProdukt(felga, 5);
        koszyk.dodajProdukt(olej, 50);

        System.out.println("\nTest: Wyświetlanie zawartości koszyka:");
        System.out.println(koszyk);

        System.out.println("\nTest: Obliczanie wartości koszyka:");
        System.out.println("Łączna wartość koszyka: " + koszyk.obliczCalkowitaWartosc() + " zł");

        Adres adres = new Adres("11 listopada", "69", "1", "Gnaty", "21-370");
        Klient klient = new Klient("Jan", "Kowalski", adres);
        
        Platnosc platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc(), "Nieopłacone");
        Zamowienie zamowienie = new Zamowienie(koszyk, platnosc);
        klient.dodajZamowienie(zamowienie);

        System.out.println("\nTest: Wyświetlanie zamówienia:");
        System.out.println(zamowienie);

        System.out.println("\nTest: Status płatności przed zapłatą:");
        System.out.println("Status płatności: " + platnosc.getStatus());

        platnosc.setStatus("Opłacone");
        System.out.println("\nTest: Status płatności po zapłacie:");
        System.out.println("Status płatności: " + platnosc.getStatus());

        System.out.println("\nTest: Wyświetlanie historii zamówień klienta:");
        klient.getZamowienia().forEach(System.out::println);

        System.out.println("\nTest: Obliczanie łącznego kosztu zamówień klienta:");
        System.out.println("Łączny koszt: " + klient.obliczLacznyKosztZamowien() + " zł");

        System.out.println("\nTest: Wyświetlanie adresu:");
        adres.pokaz();

        Adres adres2 = new Adres("Troszynska", "420", "Ostroleka", "00-420");
        System.out.println("\nTest: Porównywanie adresów (przed):");
        System.out.println("Adres 1 przed adresem 2: " + adres.przed(adres2));

        System.out.println("\nTest: Usuwanie produktu z koszyka:");
        koszyk.usunProdukt(kolo);
        System.out.println(koszyk);

        System.out.println("\nTest: Modyfikacja ilości produktu w koszyku:");
        koszyk.dodajProdukt(felga, 10);
        System.out.println("Łączna wartość koszyka po modyfikacji: " + koszyk.obliczCalkowitaWartosc() + " zł");

        System.out.println("\nTest: Porównywanie klientów:");
        Klient klient2 = new Klient("Jan", "Kowalski", adres);
        System.out.println("Czy klient1 i klient2 są tacy sami? " + klient.equals(klient2));
    }
}
