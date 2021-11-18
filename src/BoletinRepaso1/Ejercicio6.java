package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio6 {
    private int area;
    private int i;
    public void Ejercicio6(){
        while(i<2){
            System.out.println("Teclea el lado del cuadrado");
            Scanner sc= new Scanner(System.in);
            int lado = sc.nextInt();
            if(lado>0){
                area=lado*lado;
                System.out.println("El area es: " + area);
                break;
            }
            else if(lado<=0){
                System.out.println("Tienes que ser positivo y no puede ser cero");
            }

        }
    }
}
