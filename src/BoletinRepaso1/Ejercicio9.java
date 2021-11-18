package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio9 {
    private float num;
    private float i=0;
    private float acumulador=0;
    public void Ejercicio9(){
        Scanner sc= new Scanner(System.in);
        while(i<100){
            System.out.println("Teclea un numero");
            num= sc.nextInt();
            if(acumulador<100){
                i++;
                acumulador=acumulador+num;
            }
            else if (acumulador>=100){
                break;
            }
            System.out.println("La suma es " + acumulador);
        }


    }
}
