package Boletin2;
import java.util.Scanner;
public class Boletin2_3 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        float euros;
        float valor_dolar;
        float dolar;
        System.out.println("Introduce los euros: ");
        euros=cs.nextFloat();
        System.out.println("Introduce el valor del dolar: ");
        valor_dolar=cs.nextFloat();
        dolar=euros*valor_dolar;
        System.out.println("Los dolares correspondientes son: "+dolar+"$");
    }

}
