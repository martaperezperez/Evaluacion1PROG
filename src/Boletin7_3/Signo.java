package Boletin7_3;

import java.util.Scanner;

public class Signo {
    Scanner sc;
    public void Signo(){
        sc= new Scanner(System.in);
        int num= leerEnteiro();
        if (num>0){
            System.out.println("o signo é +");
        }
        else if (num==0){
            System.out.println("o numero é 0");
        }

        else{
            System.out.println("o signo é -");
        }
    }



    public int leerEnteiro(){
        System.out.println("teclear numero: ");
        int num=sc.nextInt();
        return num;
    }
}
