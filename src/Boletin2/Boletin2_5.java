package Boletin2;
import java.util.Scanner;

public class Boletin2_5 {
    public static void main(String[] args) {
        Scanner cs;
        cs = new Scanner(System.in);
        final double EQUIVALENCIA=1852;
        double millas;
        System.out.println("Intrduce el numero de millas: ");
        millas=cs.nextFloat();
        double metros= (millas*EQUIVALENCIA);
        System.out.println("Los metros son: " + metros);
    }

}
