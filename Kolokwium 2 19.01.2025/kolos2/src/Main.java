import java.util.*;
// Zadanie 1: Vehicle
class Vehicle{
    public String brand;
    public String model;
    public Vehicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
}
class Car extends Vehicle{
    public int numberOfDoors;
    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
    }
}
//Zadanie 2: Abstrakcyjny WorkTool
abstract class WorkTool{
    public String name;
    public int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear=productionYear;
    }

    public abstract void use();
}
class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }
    @Override
    public void use(){
        System.out.println("Użyto mlotka.");
    }
}
class Screwdriver extends WorkTool{
    public Screwdriver(String name, int productionYear) {
        super(name, productionYear);
    }
    @Override
    public void use(){
        System.out.println("Użyto srubokretu.");
    }
}
class Saw extends WorkTool{
    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }
    @Override
    public void use(){
    System.out.println("Użyto pily.");
    }
}
// Zadanie 3: Interfejs Sensor
abstract interface Sensor {
    abstract double readValue();
    abstract String getStatus();
    abstract void reset();

}
class TemperatureSensor implements Sensor{
    double Value;
    String Status;
    public TemperatureSensor(double Value, String Status){
    this.Value=Value;
    this.Status=Status;

    }
    @Override
    public double readValue(){
        return Value;
    }
    @Override
    public String getStatus(){
        return Status;
    }
    @Override
    public void reset(){
    }
}
class PressureSensor implements Sensor{
    double Value;
    String Status;
    public PressureSensor(double Value, String Status){
        this.Value=Value;
        this.Status=Status;

    }
    @Override
    public double readValue(){
        return Value;
    }
    @Override
    public String getStatus(){
        return Status;
    }
    @Override
    public void reset(){
    }
}
// Zadanie 4: Klasa Triple
class Triple<T,U,V>{
    private final T first;
    private final U second;
    private final V third;

    public Triple(T first, U second, V third){
        this.first = first;
        this.second= second;
        this.third = third;
    }
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
    public V getThird(){
        return third;
    }

}
// Zadanie 5: Interfejs Converter
interface Converter {
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);

}
class CurrencyConverter implements Converter {
    double amount;
    String currency;

    public CurrencyConverter(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;

    }

    @Override
    public double convertToEuro(double amount) {
        return amount;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency.equals("USD")){
            return convertToUSD(amount);
        }
        else{
            return convertToEuro(amount);
        }
    }

}
class UnitConverter implements Converter{
    double amount;
    String currency;
    public UnitConverter(double amount, String currency){
        this.amount=amount;
        this.currency=currency;

    }
    @Override
    public double convertToEuro(double amount){
        return amount;
    }
    @Override
    public double convertToUSD(double amount){
        return amount;
    }
    @Override
    public double getConversionRate(String currency){
        if(currency.equals("USD")){
            return convertToUSD(amount);
        }
        else{
            return convertToEuro(amount);
        }
    }
}
// Zadanie 6: Metoda isEqualOrNull
class isEqualOrNull{
    public static<T> boolean isEqualOrNull(T obiekt1, T obiekt2){
            return Objects.equals(obiekt1, obiekt2);
        }

}
public class Main {
    public static void main(String[] args) {
System.out.println(isEqualOrNull.isEqualOrNull(5,5));
System.out.println(isEqualOrNull.isEqualOrNull(null, null));
Car vehicle = new Car("Toyota", "Corolla", 5);
Saw pila = new Saw("Ostra pila", 2000);
pila.use();
Screwdriver srubok = new Screwdriver("Krzyzak", 1410);
srubok.use();
Hammer mlot = new Hammer("Mlot pneumatyczny", 2025);
mlot.use();
TemperatureSensor tsensor = new TemperatureSensor(10.0,"Gut gut");
System.out.println(tsensor.readValue());
System.out.println(tsensor.getStatus());
Triple triple = new Triple("dziala",5,10.0);
CurrencyConverter cur = new CurrencyConverter(1000,"USD");
System.out.println(cur.amount);
System.out.println(cur.currency);

        }


}
