import java.util.Arrays;

import static java.lang.Math.*;
public class Zestaw4 {
    
    public static int[] generujTablice(int n,int minWartosc,int maxWartosc){
        int[] tab = new int[n];
        for(int i = 0;i < n;i++){
            tab[i] = (int)(Math.random() * (maxWartosc - minWartosc+1)) + minWartosc;
        }
//        for(int j = 0;j < n;j++){
//            System.out.println(tab[j]);
//        }
        System.out.println(Arrays.toString(tab));
        return tab;
    }
    
    public static void wypiszTablice(int[] tab,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                if(j + (m*i) >= tab.length) {
                    System.out.print("' ");
                }
                else {
                    System.out.print(tab[j + (m * i)] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void generujZakres(int n,int minWartosc,int maxWartosc){
        double[] tab = new double[n];
        double roznica = (maxWartosc - minWartosc);
        double krok = roznica / (n - 1);
        for(int i = 0;i < n;i++){
            tab[i] = minWartosc + (krok*i);
        }
        for(int j = 0;j < n;j++){
            System.out.println(tab[j]);
        }
    }
    public static int ileNieparzystych(int[] tab){
        int res = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i] % 2 == 1){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " liczb nieparzystych");
        return res;
    }
    public static int ileParzystych(int[] tab){
        int res = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i] % 2 == 0){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " liczb parzystych");
        return res;
    }
    public static int ileDodatnich(int[] tab){
        int res = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i] > 0){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " liczb dodatnich");
        return res;
    }
    public static int ileUjemnych(int[] tab){
        int res = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i] < 0){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " liczb ujemnych");
        return res;
    }
    public static int ileZerowych(int[] tab){
        int res = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i] == 0){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " zer");
        return res;
    }
    public static int ileMaxymalnych(int[] tab){
        int res = 0;
        int max = tab[0];
        for(int i = 1;i < tab.length;i++) {
            if(tab[i] > max){
                max = tab[i];
            }
        }
        for(int j = 0;j < tab.length;j++){
            if (tab[j] == max){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " liczb maksymalnych");
        return res;
    }
    public static int ileMinimalnych(int[] tab){
        int res = 0;
        int min = tab[0];
        for(int i = 1;i < tab.length;i++) {
            if(tab[i] < min){
                min = tab[i];
            }
        }
        for(int j = 0;j < tab.length;j++){
            if (tab[j] == min){
                res += 1;
            }
        }
        System.out.println("Tablica zawiera " + res + " liczb minimalnych");
        return res;
    }
    public static int ileUnikalnych(int[] tab){
    }
    public static void main(String[] args){
        //generujTablice(5,1,10);
        //generujZakres(7,5,20);
        int[] tab = {1,2,3,4,5,6,7,8,9,10,11};
        //wypiszTablice(tab,4,4);
        //ileNieparzystych(generujTablice(10,1,10));
        //ileParzystych(generujTablice(10,1,10));
        //ileDodatnich(generujTablice(10,-10,10));
        //ileUjemnych(generujTablice(10,-10,10));
        //ileZerowych(generujTablice(10,0,2));
        //ileMaxymalnych(generujTablice(10,0,5));
        //ileMinimalnych(generujTablice(10,1,5));
    }
}
