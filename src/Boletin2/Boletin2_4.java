package Boletin2;
import java.util.Scanner;

public class Boletin2_4 {
    public static void main(String[] args) {
        Scanner cs;
        cs = new Scanner (System.in);
        float numero1;
        float numero2;
        System.out.println("Introduce el numero 1: ");
        numero1= cs.nextFloat();
        System.out.println("Introduce el numero 2: ");
        numero2= cs.nextFloat();
        float suma=numero1+numero2;
        float resta1=numero1-numero2;
        float resta2=numero2-numero1;
        float producto=numero1*numero2;
        float cociente1=numero1/numero2;
        float cociente2=numero2/numero1;

        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: resta1= "+ resta1 +"resta2 = "+resta2);
        System.out.println("El producto es : "+ producto);
        System.out.println("El cociente es: cociente1=" + cociente1 + " cociente2 =" + cociente2);
    }
}
