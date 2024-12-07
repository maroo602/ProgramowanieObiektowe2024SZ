public class Main {


    public static void main(String[] args) {
        System.out.println("PRODUKT");
        Produkt p1= new Produkt("Koło", "100",12);
        Produkt p2= new Produkt("Felga", "50", 50);
        Produkt p3= new Produkt("Sruba", "1",1);
//        p1.wyswietlInformacje();
//        p1.dodajDoMagazynu(12);
//        System.out.println();
//        p2.wyswietlInformacje();
//        p2.usunZMagazynu(10);
//        System.out.println();
//        p3.wyswietlInformacje();
//        p3.usunZMagazynu(5);
//        System.out.println();
        System.out.println();
        System.out.println("KOSZYK");

        KoszykZakupowy koszyk=new KoszykZakupowy();
        p1.wyswietlInformacje();
        System.out.println();
        koszyk.dodajProdukt(p1, 5);
        System.out.println();
        p2.wyswietlInformacje();
        System.out.println();
        koszyk.dodajProdukt(p2, 6);
        System.out.println();
        p3.wyswietlInformacje();
        System.out.println();
        koszyk.dodajProdukt(p3, 7);
        System.out.println();
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();
        System.out.println("Całkowita wartość: " + koszyk.obliczCalkowitaWartosc() + "zł");
        System.out.println();
        Zamowienie zamowienie = new Zamowienie(koszyk);
        zamowienie.wyswietlZamowienie();
        System.out.println();
        zamowienie.ustawStatusZamowienia("W trakcie realizacji");
        System.out.println();
        zamowienie.wyswietlZamowienie();
        System.out.println();
        KoszykZakupowy koszyk1= new KoszykZakupowy();
        koszyk1.dodajProdukt(p1,5);
        koszyk1.dodajProdukt(p2,6);
        System.out.println();
        Zamowienie zamowienie1 = new Zamowienie(koszyk1);
        Klient klient = new Klient("Koksik", "Zakupowicz");
        klient.dodajZamowienie(zamowienie1);
        klient.wyswietlHistorieZamowien();

    }
}
