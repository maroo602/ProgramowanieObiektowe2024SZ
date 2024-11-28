import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void wypiszimie(String imie, String nazwisko) {
        System.out.println(imie + " " + nazwisko);
    }

    public static void dlugoscimie(String imie, String nazwisko) {
        System.out.println(imie.length() + nazwisko.length());
    }

    public static void ala(String a, String b, String c) {
        System.out.println(a + " " + b + " " + c);
        System.out.println(a + b + c);
    }

    public static void ala2(String a, String b, String c) {
        System.out.println(a + " " + b + " " + c);
        String d = a + b + c;
        System.out.println(d.replaceAll("a|A", "e"));
    }

    public static void ala3(String a, String b, String c) {
        String d = (a + " " + b + " " + c);
        System.out.println(d.toUpperCase());
        System.out.println(d.toLowerCase());
    }

    public static void ASCII(int a, int b, int c, int d, int e, int f, int g) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void Grzesiek() {
        String abc = ("Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje.");
        String ab = String.format(abc, "tygrysz", "drapiesznikiem", "bagieta");
        System.out.println(ab);

    }

    public static void Ksiazka() {
        String abc = ("%s to najlepsza ksiazka napisana przez %s.");
        String ab = String.format(abc, "Kama Sutra", "Hindusa");
        System.out.println(ab);

    }

    public static void wodrze() {
        String abc = ("wodrze");
        String ab = abc.repeat(5);
        System.out.println(ab);

    }

    public static void Znaki(char a, char b, char c, char d, char e, char f, char g) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void Data() {
        LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Dzisiaj jest " + dtf.format(LocalDateTime.now()));
    }

    public static void dzialania() {
        Object a = 23.0 + 76;
        System.out.println(a.getClass());
        Object b = 41 * 2.0 + 3;
        System.out.println(b.getClass());
        Object c = 5 - 33;
        System.out.println(c.getClass());
        Object d = 109 % 3;
        System.out.println(d.getClass());
        Object e = 50 / 2;
        System.out.println(e.getClass());
        Object f = 4 | 2;
        System.out.println(f.getClass());
        Object g = 3 ^ 5;
        System.out.println(g.getClass());
        Object h = 7 & 9;
        System.out.println(h.getClass());
    }

    public static void dzialania2() {
        double a = (Math.sqrt(7) - 1) / 2 + (Math.pow(3, 3) % 2);
        System.out.println(a);
        System.out.println((int) a);
        double b = 2003 / (19 * 3);
        System.out.println(b);
        System.out.println((int) b);
        double c = ((3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3)) + 1;
        System.out.println(c);
        System.out.println((int) c);
        double d = 27 % 13 % 6;
        System.out.println(d);
        System.out.println((int) d);
        double e = ("budny".length() % "marcel".length() + 1) / Math.pow(2, 1 / 4);
        System.out.println(e);
        System.out.println((int) e);
    }

    public static void scan() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj slowo:");
        String a = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj 2 slowo:");
        String b = scanner2.nextLine();
        System.out.println(a + " " + b);
    }

    public static void scan2() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę: ");
        int a = scanner3.nextInt();
        System.out.println("Podaj 2 liczbę:");
        Scanner scanner4 = new Scanner(System.in);
        int b = scanner4.nextInt();
        System.out.println("Suma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloraz: " + a * b);
        System.out.println("Iloczyn: " + a / b);
    }

    public static void liczbax() {
        System.out.println("Podaj liczbę:");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println((a + 140));
        System.out.println((a - 31));
        System.out.println((a * 7));
        System.out.println((a / 13));
        System.out.println((a % 7));
        System.out.println((int) a / 4);
        System.out.println(Math.pow(a, 45));
        System.out.println((int) a & 67);
        System.out.println((int) a | 59);
        System.out.println((int) a ^ 23);
        System.out.println((int) a << 5);
        System.out.println((int) a >> 6);

    }

    public static void trojka(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                        System.out.println("trojka pitagorejska: " + i + " " + j + " " + k);
                    }
                }

            }
        }
    }

    public static void kwadrat(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((Math.pow(i, 2) - (4 * j) * k) >= 0) {
                        System.out.println("Rozwiazania kwadratu: " + "b = " + i + " a = " + j + " c = " + k);
                    }
                }

            }
        }
    }

    public static void delta(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int a = (i * i - (4 * j) * k);
                    int b = (int) Math.sqrt(a);
                    if (b * b == a) {
                        System.out.println(i + " " + j + " " + k);
                    }

                }
            }
        }
    }

    public static void natural(int n) {
        for (int i = 2; i <= n; i++) {
            boolean a = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println("Jest pierwsza: " + i);
            } else {
                System.out.println("Nie jest pierwsza: " + i);
            }


        }
    }

    public static void podzielne(int m, int n) {
        double b = 1 * Math.pow(10, m) - 1;
        for (int i = 1; i <= b; i++) {
            if (i % n == 0) {
                System.out.println(i + " jest podzielne przez " + n);
            }
        }
    }

    public static void piramida(int n, int variable) {
        if (variable == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
        if (variable == 2) {
            for (int i = n; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }

    }

    public static void silnia(int n) {
        int j = 1;
        for (int i = 1; i <= n; i++) {
            ;
            j *= i;
        }
        System.out.print(j);
    }

    public static void silniap(int n) {
        int j = 1;
        for (int i = n; i >= 1; i = i - 2) {
            ;
            j *= i;
        }
        System.out.print(j);
    }

    public static void silniam(int m, int n) {
        int j = 1;
        for (int i = n; i > 0; i -= m) {
            ;
            j *= i;
        }
        System.out.print(j);
    }

    public static void newton(int n, int k) {
        int j = 1;
        for (int i = 1; i <= n; i++) {
            ;
            j *= i;
        }
        int l = 1;
        for (int z = 1; z <= k; z++) {
            ;
            l *= z;
        }
        int x = 1;
        for (int c = 1; c <= (n - k); c++) {
            x *= c;
        }
        double xd = j / (l * x);
        System.out.println(xd);
    }

    public static void fibo(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;

            System.out.println(a + "");
        }
    }

    public static void suman(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        System.out.println(a);
    }
    public static void sumap(int n) {
        int a = 0;
        for (int i = 0; i <= n; i+=2) {
            a += i;
        }
        System.out.println(a);
    }
    public static void sumanp(int n) {
        int a = 0;
        for (int i = 1; i <= n; i+=2) {
            a += i;
        }
        System.out.println(a);
    }
    public static void sumakwn(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += (i*i);
        }
        System.out.println(a);
    }
    public static void sumasn(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += (i*i*i);
        }
        System.out.println(a);
    }
    public static void sumaon(int n) {
        double a = 0;
        for (double i = 1; i <= n; i++) {
            a += (1/i);
        }
        System.out.println(a);
    }
    public static void palindrom(String wyraz){
        StringBuilder b= new StringBuilder(wyraz);
        if(b.reverse().toString().equals(wyraz)){
            boolean a=true;
            System.out.println(a);
        }
        else{
            boolean c=false;
            System.out.println(c);
        }

    }
    public static void pascal(int n){
        for(int i=0;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            int val = 1;
            for(int k=0;k<=i;k++){
                System.out.print(val + " ");
                val = val * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
public static boolean palindroml(int n){
        int liczba = n;
        int liczba2=0;
       while(n!=0){
           int pal = n%10;
           liczba2=liczba2*10+pal;
           n/=10;
       }
    return liczba==liczba2;
}
public static boolean doskonala(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum==n;
}
public static boolean czyp(int n){
        for(int i =2;i<=n;i++){
            boolean a=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    a=false;
                    break;
                }
            }
            if(a&&i==n){
                return true;
            }
        }
        return false;

}
public static void nwd(int n, int m) {
    int max = Math.max(n, m);
    for (int i = max; i >= 1; i--) {
        if (n % i == 0 && m % i == 0) {
            System.out.println(i + " to NWD");
            break;
        }
    }

}
public static int[] tablica(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj n:");
        int n = scanner1.nextInt();
        int[] tablica = new int[n];
        System.out.println("Podaj "+n+" liczb:");
        for(int i=0;i<n;i++) {
            tablica[i] = scanner1.nextInt();
        }
        return tablica;
}
public static int[] tablica1(int n, int minWar,int maxWar){
        int[] tablica = new int[n];
        for(int i=0;i<n;i++){
            int x= minWar + (int) (Math.random() * (maxWar - minWar + 1));
            if(x>=minWar&&x<=maxWar){
                tablica[i]=x;
            }
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;


}
    public static void wypiszTablice(int[] tab,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                if(j+(m*i)>=tab.length){
                    System.out.print("' ");
                }
                else{
                    System.out.print(tab[j+(m*i)] + " ");
                }
            }
            System.out.println();
        }
    }
    public static int ileN(int[] tab){
        int suma=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]%2!=0){
                suma+=1;
            }
        }
        System.out.println(suma+ " nieparzyste");
        return suma;
    }
    public static int ileP(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]%2==0){
                suma+=1;
            }
        }
        System.out.println(suma+ " parzyste");
        return suma;
    }
    public static int ileD(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                suma+=1;
            }
        }
        System.out.println(suma+ " dodatnie");
        return suma;
    }
    public static int ileU(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                suma+=1;
            }
        }
        System.out.println(suma+ " ujemne");
        return suma;
    }
    public static int ileZ(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]==0){
                suma+=1;
            }
        }
        System.out.println(suma+ " zer");
        return suma;
    }
    public static int ileM(int[] tab){
        int suma=0;
        int max=tab[0];
        for(int i=0;i<tab.length;i++){
            if (tab[i]>max){
                max=tab[i];
            }
        }
        for(int j=0;j<tab.length;j++){
            if(tab[j]==max){
                suma+=1;
            }
        }
        System.out.println(suma+ " max");
        return suma;

    }
    public static int ileMi(int[] tab){
        int suma=0;
        int min=tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i]<min){
                min=tab[i];
            }
        }
        for(int j=0;j<tab.length;j++){
            if(tab[j]==min){
                suma+=1;
            }
        }
        System.out.println(suma+ " min");
        return suma;
    }
    public static int ileUn(int[] tab){
        int suma=0;
        int un=tab[0];
        for(int i=0;i<tab.length;i++){
            if (tab[i]!=un){
                un=tab[i];
            }
        }
        for(int j=0;j<tab.length;j++){
            if(tab[j]==un){
                suma+=1;
            }
        }
        System.out.println(suma+ " un");
        return suma;

    }
    public static int sumaDod(int[] tab){
        int suma=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0){
                suma+=tab[i];
            }
        }
        System.out.println(suma+ " suma liczb dodatnich");
        return suma;
    }
    public static int sumaUj(int[] tab){
        int suma=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                suma+=tab[i];
            }
        }
        System.out.println(suma+ " suma liczb uj");
        return suma;
    }
    public static int sumaOdw(int[] tab){
        int suma=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                suma+=(1/tab[i]);
            }
        }
        System.out.println(suma+ " suma liczb odw");
        return suma;
    }
    public static int srar(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        double a = (double) suma / tab.length;
        a = Math.round(a);
        System.out.println((int) a + " sredn");
        return (int) a;
    }
    public static int srgeo(int[] tab) {
        int iloczyn=1;
        for(int i=0;i<tab.length;i++){
            iloczyn*=tab[i];
        }
        double a= Math.pow( iloczyn,1.0/tab.length);
        a= Math.round(a);
        System.out.println((int) a + " sredn geo");
        return (int) a;
    }
    public static int srharm(int[] tab) {
        double suma =0;
        for(int i=0;i<tab.length;i++){
            suma= suma+1.0/tab[i];
        }
        double a = tab.length/suma;
        a=Math.round(a);
        System.out.println((int) a +  " sredn har");
        return (int) a;
    }
public static void najdlciagdod(int[] tab){
        int ciag=0;
        int ciag2=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                ciag++;
                ciag2=Math.max(ciag,ciag2);
            }
            else{

                ciag=0;
            }

        }
        if(ciag>ciag2|ciag2==ciag) {
            System.out.println(ciag + " najdlciagdod");
        }
        else{
            System.out.println(ciag2 + " najdlciagdod");
        }
    }
    public static void najdlciaguj(int[] tab){
        int ciag=0;
        int ciag2=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                ciag++;
                ciag2=Math.max(ciag,ciag2);
            }
            else{
                ciag=0;
            }

        }
        if(ciag>ciag2|ciag2==ciag) {
            System.out.println(ciag + " najdlciaguj");
        }
        else{
            System.out.println(ciag2 + " najdlciaguj");
        }
    }
public static void odwroctab(int[] tab){
        for(int i=0;i<tab.length/2;i++){
            int a=tab[i];
            tab[i]=tab[tab.length-1-i];
            tab[tab.length-1-i]=a;
        }
        System.out.println(Arrays.toString(tab));
}
    public static void odwroctab2(int[] tab, int iS,int iSt){
        for(int i=iS;i<(iSt+iS)/2;i++){
            int a=tab[i];
            tab[i]=tab[iSt-(i-iS)];
            tab[iSt-(i-iS)]=a;
        }
        System.out.println(Arrays.toString(tab));
    }
public static int[] linia(int[] tab, int a, int b){
        int[] xd= new int[tab.length];
        for(int i=0;i<tab.length;i++){
            xd[i]=a*tab[i]+b;

        }
        System.out.println(Arrays.toString(xd));
        return xd;
}
    public static double[] fkwa(int[] tab, int a, int b,int c){
        double[] xd= new double[tab.length];
        for(int i=0;i<tab.length;i++){
            xd[i]=a*Math.pow(tab[i],2)+(b*tab[i])+c;

        }
        System.out.println(Arrays.toString(xd));
        return xd;
    }
    public static double[] fwyk(int[] tab, int a){
        double[] xd= new double[tab.length];
        for(int i=0;i<tab.length;i++){
            xd[i]=Math.pow(a, tab[i]);
        }
        System.out.println(Arrays.toString(xd));
        return xd;
    }
    public static double[] fsig(int[] tab){
        double[] xd= new double[tab.length];
        for(int i=0;i<tab.length;i++){
            xd[i]=Math.signum(tab[i]);
        }
        System.out.println(Arrays.toString(xd));
        return xd;
    }
    public static void genzak(int n, int minWar,int maxWar){
        double[] tablica = new double[n];
        double a=(maxWar-minWar)/(n-1.0);
        for(int i=0;i<n;i++){
            tablica[i]=minWar+(a*i);
        }
        System.out.println(Arrays.toString(tablica));


    }

    public static void main(String[] args) {
//        wypiszimie("maroo", "dupa");
//        dlugoscimie("maroo", "dupa");
//        ala("Ala","ma","kota");
//        ala2("Ala","ma","kota");
//        ala3("Ala","ma","kota");
//        ASCII('A','!','@','>','~', '\n','\b');
//        Grzesiek();
//        Ksiazka();
//        wodrze();
//        Znaki((char) 54,(char) 103,(char) 241,(char) 67,(char) 9999,(char) 9,(char) 174999);
//        Data();
//        dzialania();
//        dzialania2();
//        scan();
//        scan2();
//        liczbax();
//        trojka(10);
//        kwadrat(10);
//        delta(10);
//        natural(11);
//        podzielne(2, 4);
//        piramida(5, 2);
//        silnia(5);
//        silniap(6);
//        silniam(10,3);
//        newton(10,5);
//        fibo(10);
//        suman(5);
//        sumap(5);
//        sumanp(5);
//        sumakwn(5);
//        sumasn(5);
//        sumaon(5);
//        palindrom("kaja");
//        pascal(5);

//        if(palindroml(505)){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }

//        Scanner scanner1= new Scanner(System.in);
//        System.out.println("Podaj liczbe:");
//        int n=scanner1.nextInt();
//        if(doskonala(n)){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }


//        if (czyp(83)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        nwd(125,75);
//        int[] tablica2=tablica();
//        System.out.println(Arrays.toString(tablica2));
//        tablica1(5,0,10);
        int[] tab= {1,2,3,4,5,6,7,8,9};
//        wypiszTablice(tab,2,6);
//        ileN(tablica1(10,5,10));
//        ileP(tablica1(20,12,19));
//        ileD(tablica1(10,20,30));
//        ileU(tablica1(10,-30,30));
//        ileZ(tablica1(10,-1,1));
//        ileM(tablica1(10,0,5));
//        ileMi(tablica1(10,0,5));
//        ileUn(tablica1(10,0,5));
//        sumaDod(tablica1(10,-10,10));
//        sumaUj(tablica1(10,-10,10));
//        sumaOdw(tablica1(10,-10,10));
//        srar(tablica1(10,0,6));
//        srgeo(tablica1(10,1,6));
//        srharm(tablica1(10,2,6));
//        najdlciagdod(tablica1(10,-5,5));
//        najdlciaguj(tablica1(10,-10,6));
//        odwroctab(tablica1(10,5,15));
//        odwroctab2(tablica1(10,5,15),2,5);
        linia(tablica1(10,5,15),5,6);
        fkwa(tablica1(10,5,15),5,6,3);
        fwyk(tablica1(10,5,15),5);
        fsig(tablica1(10,5,15));
        genzak(5,7,10);
    }
}
