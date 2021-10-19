package Boletin3;
import java.util.Scanner;
public class Boletin3_1 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Precio tarifa");
        float preciotarifa=cs.nextFloat();
        System.out.println("Precio pagado");
        float preciopagado= cs.nextFloat();
        float descuento= preciotarifa-preciopagado;
        float porcentaje= descuento*100/preciotarifa;
        System.out.println("el descuento es de un "+ porcentaje+ "%");



    }

}
