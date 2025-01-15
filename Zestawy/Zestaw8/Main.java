import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Adres adres = new Adres("Karabina", 23,"Sosnowiec", "00-000");
        Produkt a = new Produkt("telefon",1000,42);
        Produkt ac = new Produkt("konkuter",2000,2);
        Produkt b = new Produkt("laptop",9000,4);
        Magazyn m = new Magazyn();
        Spodnie spodnie = new Spodnie("Dresy",79.99,59);
        System.out.println(spodnie.getIloscNaMagazynie());
        KoszykZakupowy k = new KoszykZakupowy();
        k.dodajProdukt(a,5);
        k.dodajProdukt(ac,1);
        k.dodajProdukt(b,2);
        KoszykZakupowy k2 = new KoszykZakupowy();
        k2.dodajProdukt(a,1);

        Zamowienie z = new Zamowienie(k, Zamowienie.statusy.Przyjete, new Platnosc(k.obliczCalkowitaWartosc(), "Nieopacone"));
        z.wyswietlZamowienie();
        z.wyswietlZamowienie();

        Zamowienie z2 = new Zamowienie(k2, Zamowienie.statusy.Przyjete, new Platnosc(k2.obliczCalkowitaWartosc(), "Nieopacone"));

        Klient klient = new Klient("Andrzej", "Andrzejek", adres);
        klient.dodajZamowienie(z);
        klient.dodajZamowienie(z2);
        klient.wyswietlHistorieZamowien();
        klient.wyswietlLacznyKosztZamowien();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1613);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        Date dataPowstania = calendar.getTime();
        Sklep bieda = new Sklep("Biedronka", dataPowstania, m);
        bieda.dodajProdukt(a);
        bieda.dodajProdukt(b);
        bieda.wyswietlOferty();
        bieda.dodajProdukt(ac);
        bieda.wyswietlOferty();
        bieda.zakupy(k2,b,21);
        System.out.println(s.wyszukajProduktu("laptop").getNazwa());
        k2.wyswietlZawartosckoszyka();
        z.getPlatnosc().zaplac();
        z.finalizujZamowienie();
        z.wyswietlZamowienie();
        z.zwrocProdukt(a,6);
    }
}
