import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class KoszykZakupowy {
    private Map<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt == null || ilosc <= 0) {
            throw new IllegalArgumentException("Produkt nie może być null, a ilość musi być większa od zera.");
        }
        produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
    }

    public void usunProdukt(Produkt produkt) {
        if (produkt == null || !produkty.containsKey(produkt)) {
            throw new IllegalArgumentException("Nie można usunąć produktu, który nie znajduje się w koszyku.");
        }
        produkty.remove(produkt);
    }

   public double obliczCalkowitaWartosc() {
    double suma = 0;
    for (Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
        Produkt p = entry.getKey(); 
        int ilosc = entry.getValue(); 
        suma += p.getCena() * ilosc;  
    }
    return suma;
}

    @Override
    public String toString() {
        return "KoszykZakupowy{" +
                "produkty=" + produkty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KoszykZakupowy that = (KoszykZakupowy) o;
        return Objects.equals(produkty, that.produkty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produkty);
    }
}
