public class Main {
    public static void main(String[] args) {
     Elf Julian = new Elf("Julian",2137,"Spawacz");
     Elf Wladek = new Elf("Władek",420,"Donosiciel");
     Wladek.przedstawSie();
     Renifer Rudy= new Renifer("Rudy",20);
     Renifer Czarnt= new Renifer("Czarny",15);
     Rudy.wyswietlInformacje();
     Czarnt.wyswietlInformacje();
     Rudy.nakarmRenifera();
     System.out.println();
     Rudy.wyswietlInformacje();
     Fabryka fabryka=new Fabryka();
     fabryka.dodajPracownika(Wladek);
     fabryka.dodajPracownika(Julian);
     fabryka.usunPracownika(Wladek);
     Sanie sanie = new Sanie();
     sanie.dodajRenifera(Rudy);
     sanie.sumaPredkosci();
    }

}