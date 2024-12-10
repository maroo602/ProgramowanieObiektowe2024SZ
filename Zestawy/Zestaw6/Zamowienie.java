public class Zamowienie {
    public KoszykZakupowy koszykZakupowy;
    public String statusZamowienia;
    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Przyjęte";
    }
    public void ustawStatusZamowienia(String nowy){

        this.statusZamowienia = nowy;
    }
    public void wyswietlZamowienie(){
        System.out.println("SZCZEGÓŁY: ");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status: " + statusZamowienia);
        System.out.println("Wartość: "+ koszykZakupowy.obliczCalkowitaWartosc() + "zł");

    }
}
