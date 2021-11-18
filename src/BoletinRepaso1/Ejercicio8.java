package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio8 {
    private int area;
    private int i;
    public void Ejercicio8(){
        while(i<5){
            System.out.println("Teclea el lado del cuadrado");
            Scanner sc= new Scanner(System.in);
            int lado = sc.nextInt();
            if(lado>0){
                area=lado*lado;
                System.out.println("El area es: " + area);
                i++;

            }
            else if(lado<0){
                System.out.println("Tienes que ser positivo");
            }
            else if(lado==0){
                System.out.println("Se acaba el programa");
                break;
            }

        }
    }
}
