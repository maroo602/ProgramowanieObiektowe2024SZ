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
