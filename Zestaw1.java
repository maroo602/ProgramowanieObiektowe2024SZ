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
