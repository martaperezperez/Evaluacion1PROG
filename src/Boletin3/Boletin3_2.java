package Boletin3;
import java.util.Scanner;
public class Boletin3_2 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("valor temperatura en grados centígrados");
        float centigrados = cs.nextFloat();

        float Fahrenheit= (float) ( centigrados*1.8+32);
        float Kelvin= 273 +centigrados;
        System.out.println("En Fahrenheit es : " + Fahrenheit + " En Kelvin es : " + Kelvin);
    }

}
