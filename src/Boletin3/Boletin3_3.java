package Boletin3;
import java.util.Scanner;
public class Boletin3_3 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        System.out.println("Billetes de 100");
        int billetes_100 = cs.nextInt();
        System.out.println("billetes de 20");
        int billetes_20 = cs.nextInt();
        System.out.println("billetes de 5");
        int billetes_5 = cs.nextInt();
        System.out.println("monedas de 1");
        int monedas_1 = cs.nextInt();

        int total=billetes_100*100+billetes_20*20+billetes_5*5+monedas_1*1;
        System.out.println("El total es : " + total);

    }
}
