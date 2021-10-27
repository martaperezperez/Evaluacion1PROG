package Boletin7_1;

import java.util.Scanner;

public class Numeropositivo {
    Scanner sc;
    public void numPoritivo(){
        sc= new Scanner(System.in);
        System.out.println("teclea numero enteiro: ");
        int num= sc.nextInt();
        //condicional
        if (num > 0) {
            System.out.println(num +  " e positivo");
        }


    }
}
