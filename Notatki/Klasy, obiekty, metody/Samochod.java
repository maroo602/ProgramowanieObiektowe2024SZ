public class Samochod {
    String marka;
    String model;
    int rokProdukcji;

    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model= model;
        this.rokProdukcji = rokProdukcji;

    }

    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka + ",  Model: " + model + ", Rok: " + rokProdukcji);
    }

    public static void main(String[] args) {
        Samochod auto = new Samochod("Toyota", "Corolla", 2003);

        auto.wyswietlInformacje();
    }
}
