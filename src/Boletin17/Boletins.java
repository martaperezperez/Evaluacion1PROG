package Boletin17;
import java.util.Scanner;
public class Boletins {
    private float boletins;
    private float resultado;
    Scanner cs=new Scanner(System.in);
    public float Boletins(){
        System.out.println("Cantidad de boletines echos del 1 al 100: ");
        boletins =  cs.nextFloat();
        if(boletins >90){
            resultado=2;
            System.out.println("La puntuacion es: " + resultado);
            return resultado;
        }
        else if (boletins>=70 && boletins <=90 ){
            resultado=1;
            System.out.println("La puntuacion es: " + resultado);
            return resultado;
        }
        else{
            resultado=0;
            System.out.println("La puntuacion es: " + resultado);
            return resultado;
        }
    }
}
