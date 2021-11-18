package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio5 {
    private int num;
    private int i=0;
    private int acumulador=0;
    Scanner sc = new Scanner(System.in);
    public void Ejercicio5(){
        while(i<4){
            System.out.println("Teclea un numero");
            num = sc.nextInt();
            if(num>=0){
                i++;
                acumulador=acumulador+num;
            }
            else if(num<0){
                System.out.println("Os numeros no pueden ser negativos");
            }
        }
        System.out.println("La suma es " + acumulador);
    }
}
