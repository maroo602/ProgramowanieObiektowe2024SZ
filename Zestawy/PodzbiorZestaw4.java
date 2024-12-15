import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int[] wczytajTablice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę elementów tablicy: ");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i + 1) + " element tablicy: ");
            tab[i] = scanner.nextInt();
        }
        return tab; 
    }

    public static void podzbiory(int[] tab) {
        int n = tab.length;
        //2^n
        int liczbaPodzbiorow = 1 << n;
        
        for (int i = 0; i < liczbaPodzbiorow; i++) {
            ArrayList<Integer> podzbior = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    podzbior.add(tab[j]);
                }
            }
            System.out.println(podzbior);
        }
    }

    public static void main(String[] args) {
        int[] tablica = wczytajTablice();
        System.out.println("Wszystkie podzbiory:");
        podzbiory(tablica);
    }
}
