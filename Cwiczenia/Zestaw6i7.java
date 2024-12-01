import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produkt{
    String nazwa;
    String cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, String cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietlInformacje(){
        System.out.println("Nazwa: "+nazwa+", Cena: " + cena+ ", Ilość na magazynie: "+ iloscNaMagazynie);
    }
    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie += ilosc;
        System.out.println("Nowa ilosc: "+iloscNaMagazynie);
    }
    public void usunZMagazynu(int ilosc){
        if(iloscNaMagazynie-ilosc<0){
            System.out.println("Za mała ilość na magazynie, nie można usunąć.");
        }
        else{
            iloscNaMagazynie=iloscNaMagazynie-ilosc;
            System.out.println("Nowa ilość: "+ iloscNaMagazynie);
        }
    }
        }

//        class KoszykZakupowy{
//    String[] lista={};
//    public KoszykZakupowy(){
//        this.lista=lista;
//    }
//    public
//            public void wyswietlZawartoscKoszyka(){
//                System.out.println(lista);
//            }
//
//        }


//class Magazyn{
//    String produkt;
//    int iloscNaMagazynie;
//
//    public Magazyn(String nazwa, int iloscNaMagazynie){
//        this.produkt = ;
//        this.iloscNaMagazynie = iloscNaMagazynie;
//    }
//    public void wyswietlInformacje2(){
//        System.out.println("Produkt: " + produkt);
//    }
//
//    }

public class Zestaw6i7 {

//    public static void append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
//        tab1.addAll(tab2);
//        System.out.println(tab1);
//    }
//    public static void merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
//        for(int i=0; i<tab1.size(); i=i+2){
//            for(int j=1; j<tab2.size(); j++) {
//                tab1.add(i, tab2.get(j));
//            }
//        }
//        System.out.println(tab1);
//}
    public static void main(String[] args) {
//        ArrayList<Integer> tab1= new ArrayList<Integer>();
//        tab1.add(1);
//        tab1.add(2);
//        tab1.add(3);
//        ArrayList<Integer> tab2= new ArrayList<Integer>();
//        tab2.add(4);
//        tab2.add(5);
//        tab2.add(6);
//        append(tab1,tab2);
//        merge(tab1,tab2);
    Produkt p1= new Produkt("Koło", "100",12);
    Produkt p2= new Produkt("Felga", "50", 50);
    Produkt p3= new Produkt("Sruba", "1",1);
    p1.wyswietlInformacje();
    p1.dodajDoMagazynu(12);
    System.out.println();
    p2.wyswietlInformacje();
    p2.usunZMagazynu(10);
    System.out.println();
    p3.wyswietlInformacje();
    p3.usunZMagazynu(5);
    System.out.println();

    }
}
