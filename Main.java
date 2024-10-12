import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        double a = 23.0+76;
        System.out.println(int.class.isInstance(23.0+76));
        System.out.println(double.class.isInstance(a));
        System.out.println(float.class.isInstance(23.0+76));
        System.out.println(short.class.isInstance(23.0+76));
        System.out.println(long.class.isInstance(23.0+76));
        System.out.println(byte.class.isInstance(23.0+76));
        System.out.println(char.class.isInstance(23.0+76));
        System.out.println(boolean.class.isInstance(23.0+76));


        System.out.println(int.class.isInstance(5-33));
        System.out.println(short.class.isInstance(5-33));
        System.out.println(byte.class.isInstance(5-33));
        System.out.println(double.class.isInstance(5-33));
        //Zadanie 2
        double aa = Math.sqrt(7);
        double bb = aa - 1;
        double cc= (bb/2);
        double dd= Math.pow(3,3);
        double ee = dd%2;
        System.out.println(cc+ee);
    }
}