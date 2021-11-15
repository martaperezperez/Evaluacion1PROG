package Boletin9_4;

import java.util.Scanner;

public class TablaMultiplicar {
    private int i=0;
    private int num=0;
    private int multiplo=0;
    Scanner sc=new Scanner(System.in);
    public TablaMultiplicar(){
    }
    public void multiplicar(TablaMultiplicar table){
        i=0;
        System.out.println("Introduce el numero del que quieras saber la tabla");
        num= sc.nextInt();
        if(num==0){
            System.out.println(0);
        }
        while (i<11){
            multiplo=num*i;
            System.out.println(num + " * " + i + "=" + multiplo);
            i++;
        }
        table.multiplicar(table);
    }
}
