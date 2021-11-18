package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio2 {
    private int num;
    private int i=0;
    Scanner sc = new Scanner(System.in);
    public void Ejercicio2(){
        while(i<5){

            System.out.println("Teclea un numero");
            num = sc.nextInt();
            i++;
        }
    }
}
