package Boletin3;
import java.util.Scanner;
public class Boletin3_4 {
    public static void main(String[] args) {
        int dinero;
        int billete_100;
        int billete_20;
        int billete_5;
        int moneda_1;
        Scanner sc=new Scanner(System.in);
        dinero= sc.nextInt();
        billete_100= dinero/100;
        billete_20 =((dinero%100)/20);
        billete_5=((dinero%100)%20/5);
        moneda_1=(((dinero%100)%20)%5/1);

        System.out.println("Billetes de 100: " + billete_100 + "\n Billetes de 20: " + billete_20 + "\n Billetes de 5: " + billete_5 + "\n monedas de 1: " + moneda_1);
    }

}
