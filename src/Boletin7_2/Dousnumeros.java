package Boletin7_2;

import java.util.Scanner;

public class Dousnumeros {
    Scanner sc;
    public void Dousnumeros(){
        sc= new Scanner(System.in);

        short num1= (short) pedirEnteiro();
        short num2= (short) pedirEnteiro();

        //condicional

        if (num1>=num2){
            System.out.println("la resta es: " + (num1-num2));
        }
        else{
            System.out.println("la suma es : " + (num1+num2));
        }

    }

    public int pedirEnteiro(){
        System.out.println("teclear numero enteiro: ");
        short num= sc.nextShort();
        return num;
    }
}
