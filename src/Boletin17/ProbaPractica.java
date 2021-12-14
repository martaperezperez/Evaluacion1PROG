package Boletin17;
import java.util.Scanner;
public class ProbaPractica {
    private float practica;
    Scanner cs=new Scanner(System.in);
    public void amosarResultado(){
        System.out.println("Nota de la prueba practica");
        practica= cs.nextFloat();
    }
    public void calcularNotaProbaPractica(){
        System.out.println("La nota practica es: " +practica*0.04);
    }
}
