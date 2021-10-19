package Boletin_Extra_1;
import java.util.Scanner;
public class Boletin_Extra_1_2 {
    public static void main(String[] args) {

        int nota_final;
        Scanner cs= new Scanner(System.in);
        System.out.println("Notas Programación ");
        System.out.println("1º parcial" );
        int parcial_1= cs.nextInt();
        System.out.println("2º parcial");
        int parcial_2= cs.nextInt();

        nota_final= (parcial_1+parcial_2)/2;
        System.out.println("nota final " + nota_final);
    }
}
