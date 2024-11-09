import java.util.Arrays;

public class Main {
    //ZADANIE 1 i 7
    public static int[] generujTablice(int n,int minWartosc,int maxWartosc){
        int[] tab = new int[n];
        for(int i = 0;i < n;i++){
            tab[i] = (int)(Math.random() * (maxWartosc - minWartosc+1)) + minWartosc;
        }
        System.out.println(Arrays.toString(tab));
        return tab;
    }
    public static void generujZakres(int n,int minWartosc,int maxWartosc){
        double[] tab = new double[n];
        double roznica = (maxWartosc - minWartosc)/(n - 1.0);
        for(int i = 0;i < n;i++){
            tab[i] = minWartosc + (roznica*i);
        }
        System.out.println(Arrays.toString(tab));
    }
    //ZADANIE 2
    public static void wypiszTablice(int[] tab,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                if(j + (m*i) >= tab.length) {
                    System.out.print(". ");
                }
                else {
                    System.out.print(tab[j + (m * i)] + " ");
                }
            }
            System.out.println();
        }
    }
    //ZADANIE 3
    public static int ileNieparzystych(int[] tab){
        int nieparzyste = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i]%2!=0) {
                nieparzyste+=1;
            }
        }
        System.out.println("Ilość liczb nieparzystych: " + nieparzyste);
        return nieparzyste;
    }
    public static int ileParzystych(int[] tab){
        int parzyste = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i]%2==0) {
                parzyste+=1;
            }
        }
        System.out.println("Ilość liczb parzystych: " + parzyste);
        return parzyste;
    }
    public static int ileDodatnich(int[] tab){
        int dodatnie = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i]>=0) {
                dodatnie+=1;
            }
        }
        System.out.println("Ilość liczb dodatnich: " + dodatnie);
        return dodatnie;
    }
    public static int ileUjemnych(int[] tab){
        int ujemne = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i]<0) {
                ujemne+=1;
            }
        }
        System.out.println("Ilość liczb ujemnych: " + ujemne);
        return ujemne;
    }
    public static int ileZerowych(int[] tab){
        int zerowe = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i]==0) {
                zerowe+=1;
            }
        }
        System.out.println("Ilość liczb zerowych: " + zerowe);
        return zerowe;
    }
    static int ileMaxymalnych(int[] tab)
    {
        int i;
        int suma=0;
        int max = tab[0];
        for (i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        for (i = 0; i < tab.length; i++) {
            if (tab[i] == max)
                suma+=1;
        }
        System.out.println("Ilość liczb maxymalnych: " + suma);
        return suma;
    }
    static int ileMinimalnych(int[] tab)
    {
        int i;
        int suma=0;
        int max = tab[0];
        for (i = 1; i < tab.length; i++) {
            if (tab[i] < max)
                max = tab[i];
        }
        for (i = 0; i < tab.length; i++) {
            if (tab[i] == max)
                suma+=1;
        }
        System.out.println("Ilość liczb minimalnych: " + suma);
        return suma;
    }
    public static void main(String[] args) {
        int[] tab= {2, 1, 3, 7, 4, 2, 0, 6, 9};
        generujTablice(5,1, 15);
        generujZakres(7,5,20);
        //wypiszTablice(tab, 3,4);
        //ileNieparzystych(generujTablice(5,1,15));
        //ileParzystych((generujTablice(5,1, 15)));
        //ileDodatnich(generujTablice(5,1,15));
        //ileUjemnych(generujTablice(5,-10,0));
        //ileZerowych(generujTablice(5,-5,5));
        //ileMaxymalnych(generujTablice(5,9,10));
        //ileMinimalnych(generujTablice(5,9,10));

    }
}
