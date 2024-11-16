import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
        public static void main(String[] args) {
            //Zadanie 1
            System.out.println("Marcel Budny");
            //Zadanie 2
            String xd = "MarcelBudny";
            System.out.println(xd.length());
            //Zadanie 3
            String A = "Ala ";
            String B = "ma ";
            String C = "kota ";
            String D = A+B+C;
            System.out.println(D);
            //Zadanie 4 A
            System.out.println("                     * ");
            System.out.println("                     * * *");
            System.out.println("                     * * * *");
            System.out.println(" * * * * * * * * * * * * * * *");
            System.out.println(" * * * * * * * * * * * * * * * *");
            System.out.println(" * * * * * * * * * * * * * * *");
            System.out.println("                     * * *");
            System.out.println("                     * *");
            System.out.println("                     * ");
            //Zadanie 4 B
            System.out.println("      * ");
            System.out.println("     * * ");
            System.out.println("    * * * ");
            System.out.println("   * * * *");
            System.out.println("  * * * * *");
            System.out.println(" * * * * * *");
            System.out.println("  * * * * *");
            System.out.println("   * * * *");
            System.out.println("    * * * ");
            System.out.println("     * * ");
            System.out.println("      * ");
            //Zadanie 5
            String E = D.replace('a','e');
            System.out.println(E);
            //Zadanie 6
            String F = D.toUpperCase();
            System.out.println(F);
            String G = D.toLowerCase();
            System.out.println(G);
            //Zadanie 7
            int abc='A';
            System.out.println(abc);
            int abcc='!';
            System.out.println(abcc);
            int abccc='@';
            System.out.println(abccc);
            int abcccc='>';
            System.out.println(abcccc);
            int abccccc='~';
            System.out.println(abccccc);
            int abcccccc='\n';
            System.out.println(abcccccc);
            int abccccccc='\b';
            System.out.println(abccccccc);
            //Zadanie 8

            int esa = 'a';
            int essa = 'z';
            int ez = 'A';
            int ezz='Z';
            int okok= '0';
            int oko= '9';
            System.out.println("Male litery");
            System.out.println(esa);
            System.out.println(essa);
            System.out.println("Wielkie litery");
            System.out.println(ez);
            System.out.println(ezz);
            System.out.println("Liczby");
            System.out.println(okok);
            System.out.println(oko);
            //Zadanie 9
            String I = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje.";
            String J = String.format(I, "jaguar", "ssakiem", "wyglad");
            System.out.println(J);
            //Zadanie 10
            String K = "%s to najlepsza książka napisana przez %s";
            String L = String.format(K, "Starcie Królów", "G. R. R. Martina");
            System.out.println(L);
            //Zadanie 11
            String M = "wodrze ";
            System.out.print(M.repeat(5));
            //Zadanie 12
            LocalDate date = LocalDate.now();
            LocalTime date2= LocalTime.now();
            System.out.println("Dzisiaj jest " + date + " godzina " + date2);
            //Zadanie 13
            System.out.println((char) 54);
            System.out.println((char) 103);
            System.out.println((char) 241);
            System.out.println((char) 67);
            System.out.println((char) 9999);
            System.out.println((char) 11);
            System.out.println((char) 174999);
        }

    }
        public static int podciag(int[] tab){
            int res = 0;
            int licznik = 1;
            for(int i = 1;i < tab.length; i++){
                if(tab[i] < tab[i-1]){
                    licznik++;
                }
                else{
                    licznik = 1;
                }
                if(licznik > res){
                    res = licznik;
                }
            }
            return res;
        }
        public static int podciag(int[] tab,int r){
            int res = 0;
            int licznik = 1;
            for(int i = 1;i < tab.length; i++){
                if(tab[i-1] - tab[i] == r){
                    licznik++;
                }
                else{
                    licznik = 1;
                }
                if(licznik > res){
                    res = licznik;
                }
            }
            return res;
        }
        int[] tab = {5,3,1,8,5,2,1,0,3};
        System.out.println(podciag(tab,2));
public class CiagArytmetyczny {
    public static void main(String[] args) {
        int pierwszaLiczba = 2;  // pierwsza liczba w ciągu
        int roznica = 3;         // różnica między kolejnymi liczbami
        int iloscElementow = 10; // liczba elementów w ciągu

        for (int i = 0; i < iloscElementow; i++) {
            System.out.print(pierwszaLiczba + (i * roznica) + " ");
        }
    }
}
public class Collatz {
    public static void main(String[] args) {
        int startLiczba = 10;  // początkowa liczba sekwencji
        int iloscLiczb = 15;   // liczba elementów do wypisania

        wypiszCollatz(startLiczba, iloscLiczb);
    }

    public static void wypiszCollatz(int c, int n) {
        System.out.print(c + " ");
        int liczba = c;
        for (int i = 1; i < n; i++) {
            if (liczba % 2 == 0) {
                liczba /= 2;
            } else {
                liczba = 3 * liczba + 1;
            }
            System.out.print(liczba + " ");
        }
    }
}
public class Collatz {
    public static void main(String[] args) {
        int startLiczba = 10;  // początkowa liczba sekwencji
        int iloscLiczb = 15;   // liczba elementów do wygenerowania

        int[] wyniki = znajdzMinMaxCollatz(startLiczba, iloscLiczb);
        System.out.println("min= " + wyniki[0] + " max= " + wyniki[1]);
    }

    public static int[] znajdzMinMaxCollatz(int c, int n) {
        int[] minMax = new int[2];
        int liczba = c;
        minMax[0] = liczba; // początkowo ustaw min i max na pierwszą liczbę
        minMax[1] = liczba;

        for (int i = 0; i < n; i++) {
            if (liczba % 2 == 0) {
                liczba /= 2;
            } else {
                liczba = 3 * liczba + 1;
            }

            if (liczba < minMax[0]) {
                minMax[0] = liczba;
            }

            if (liczba > minMax[1]) {
                minMax[1] = liczba;
            }
        }

        return minMax;
    }
}

