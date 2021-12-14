package Boletin17;
import java.util.Scanner;
public class ProbasEscritas {
    private float proba1;
    private float proba2;
    private float resultado;
    Scanner cs=new Scanner(System.in);
    public void amosarNotas(){
        System.out.println("Nota primera prueba:");
        proba1 = cs.nextFloat();
        System.out.println("Nota segunda prueba");
        proba2= cs.nextFloat();
    }
    public float calcularNotasProbasEscritas(){
        resultado=(proba1+proba2)/2;
        System.out.println("La nota de las pruebas escritas son: " + resultado*0.40 );
        return resultado;
    }
}
