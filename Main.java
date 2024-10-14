import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Zadanie 1 nierozwiazane 1 - ciagle false 
        System.out.println(int.class.isInstance(23.0+76));
        System.out.println(double.class.isInstance(23.0+76));
        System.out.println(float.class.isInstance(23.0+76));
        System.out.println(short.class.isInstance(23.0+76));
        System.out.println(long.class.isInstance(23.0+76));
        System.out.println(byte.class.isInstance(23.0+76));
        System.out.println(char.class.isInstance(23.0+76));
        System.out.println(boolean.class.isInstance(23.0+76));
        //Zadanie 1 rozwiazane 
        Object d = 23.0+76;
        System.out.println(d.getClass());
        Object dz = 41*2.0+3;
        System.out.println(dz.getClass());
        Object dzi = 5-33;
        System.out.println(dzi.getClass());
        Object dzia = 109%3;
        System.out.println(dzia.getClass());
        Object dzial = 50/2;
        System.out.println(dzial.getClass());
        Object dziala = 4|2;
        System.out.println(dziala.getClass());
        Object dzialan = 3^5;
        System.out.println(dzialan.getClass());
        Object dzialani = 7&9;
        System.out.println(dzialani.getClass());

        System.out.println(int.class.isInstance(5-33));
        System.out.println(short.class.isInstance(5-33));
        System.out.println(byte.class.isInstance(5-33));
        System.out.println(double.class.isInstance(5-33));
        //Zadanie 2
        //A
        double aa = Math.sqrt(7);
        double bb = aa - 1;
        double cc= (bb/2);
        double dd= Math.pow(3,3);
        double ee = dd%2;
        double ff=cc+ee;
        System.out.println(ff);
        System.out.println((int) ff);
        //B
        double gg= 2003/(19*3);
        System.out.println(gg);
        System.out.println((int) gg);
        //C
        double hh=3+Math.sqrt(3);
        double ii=(Math.sqrt(5)/2)/3;
        double jj=(hh+ii)+1;
        System.out.println(jj);
        System.out.println((int) jj);
        //D
        double kk=37.3%319.7%441.5;
        System.out.println(kk);
        System.out.println((int) kk);
        //E
        String nazwisko = "Budny";
        String imie = "Marceli";
        System.out.println(imie.length());
        double ll = (nazwisko.length()%imie.length()+1)/Math.pow(2,1/4);
        System.out.println(ll);
        System.out.println((int) ll);
        //Zadanie 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pierwsze slowo: ");
        String slowo = scanner.next();
        System.out.println("Drugie slowo: ");
        String slowo2 = scanner.next();
        System.out.println(slowo);
        System.out.println(slowo2);
        //Zadanie 4
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Pierwsza liczba: ");
        int liczba = scanner.nextInt();
        System.out.println("Druga liczba: ");
        int liczba2 = scanner.nextInt();
        System.out.println("Dodawanie: " + (liczba+liczba2));
        System.out.println("Odejmowanie: " + (liczba-liczba2));
        System.out.println("Mnozenie: " + (liczba*liczba2));
        System.out.println("Dzielenie: " + (liczba/liczba2));
        //Zadanie 5
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double x = scanner.nextDouble();
        System.out.println(x+140);
        System.out.println(x-31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println((int)x/4);
        System.out.println(Math.pow(x,45));
        System.out.println((int)x&67);
        System.out.println((int)x|59);
        System.out.println((int)x^23);
        System.out.println((int)x<<5);
        System.out.println((int)x>>6);
    }
}
