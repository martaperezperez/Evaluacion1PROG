package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio3 {
    private int num;
    private int i=0;
    Scanner sc = new Scanner(System.in);
    public void Ejercicio3(){
        while(i<5){
            System.out.println("Teclea un numero");
            num = sc.nextInt();
            if(num!=0){
                i++;
            }
            else if(num==0){
                System.out.println("Rematase o programa");
                break;
            }
        }

    }
}
