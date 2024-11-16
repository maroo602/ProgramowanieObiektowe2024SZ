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
