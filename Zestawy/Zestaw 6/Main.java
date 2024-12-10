public class Main {
    public static void main(String[] args) {
        // Tworzenie produktów
        Produkt kolo = new Produkt("Kolo", 150.50, 100);
        Produkt felga = new Produkt("Felga", 300.20, 50);
        Produkt olej = new Produkt("Olej", 50.0, 30);

        // Wyświetlanie informacji o produktach
        System.out.println("Test: Wyświetlanie produktów:");
        kolo.wyswietlInformacje();
        felga.wyswietlInformacje();
        olej.wyswietlInformacje();

        // Modyfikacja stanów magazynowych
        System.out.println("\nTest: Dodawanie do magazynu:");
        kolo.dodajDoMagazynu(20);
        kolo.wyswietlInformacje();

        System.out.println("\nTest: Usuwanie z magazynu:");
        kolo.usunZMagazynu(50);
        kolo.wyswietlInformacje();

        // Tworzenie sklepu
        Sklep sklep = new Sklep();
        sklep.dodajProdukt(kolo);
        sklep.dodajProdukt(felga);
        sklep.dodajProdukt(olej);

        System.out.println("\nTest: Wyświetlanie oferty sklepu:");
        sklep.wyswietlOferty();

        System.out.println("\nTest: Wyszukiwanie produktu:");
        Produkt wyszukany = sklep.wyszukajProdukt("Kolo");
        if (wyszukany != null) {
            wyszukany.wyswietlInformacje();
        } else {
            System.out.println("Produkt nie znaleziony.");
        }

        // Koszyk zakupowy
        KoszykZakupowy koszyk = new KoszykZakupowy();
        System.out.println("\nTest: Dodawanie produktów do koszyka:");
        koszyk.dodajProdukt(kolo, 10);
        koszyk.dodajProdukt(felga, 5);
        koszyk.dodajProdukt(olej, 50);

        System.out.println("\nTest: Wyświetlanie zawartości koszyka:");
        koszyk.wyswietlZawartoscKoszyka();

        System.out.println("\nTest: Obliczanie wartości koszyka:");
        System.out.println("Łączna wartość koszyka: " + koszyk.obliczCalkowitaWartosc() + " zł");

        // Zamówienie
        Zamowienie zamowienie = new Zamowienie(koszyk);
        System.out.println("\nTest: Wyświetlanie zamówienia:");
        zamowienie.wyswietlZamowienie();

        System.out.println("\nTest: Zmiana statusu zamówienia:");
        zamowienie.ustawStatusZamowienia("W realizacji");
        zamowienie.wyswietlZamowienie();

        // Klient
        Klient klient = new Klient("Jan", "Kowalski");
        klient.dodajZamowienie(zamowienie);

        System.out.println("\nTest: Wyświetlanie historii zamówień klienta:");
        klient.wyswietlHistorieZamowien();

        System.out.println("\nTest: Obliczanie łącznego kosztu zamówień klienta:");
        System.out.println("Łączny koszt: " + klient.obliczLacznyKosztZamowien() + " zł");

        // Płatność
        Platnosc platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
        System.out.println("\nTest: Status płatności przed zapłatą:");
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());

        platnosc.zaplac();
        System.out.println("\nTest: Status płatności po zapłacie:");
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());

        // Zamówienie
        Zamowienie zamowienie2 = new Zamowienie(koszyk, platnosc);
        System.out.println("\nTest: Wyświetlanie zamówienia:");
        zamowienie2.wyswietlZamowienie();

        System.out.println("\nTest: Finalizowanie zamówienia:");
        zamowienie2.finalizujZamowienie();
        zamowienie2.wyswietlZamowienie();

        // Zwrot produktu
        System.out.println("\nTest: Zwrot produktu:");
        zamowienie.zwrocProdukt(kolo, 5);
        koszyk.wyswietlZawartoscKoszyka();
    }
}
