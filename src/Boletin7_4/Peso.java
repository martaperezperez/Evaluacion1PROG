package Boletin7_4;

import java.util.Scanner;

public class Peso {
    private String nome1;
    private String nome2;
    private float peso1;
    private float peso2;
    public void Peso(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nome da primeira persoa:");
        nome1=  sc.next();
        System.out.println("Nome da segunda persoa:");
        nome2= sc.next();
        System.out.println("Peso da primeira persoa:");
        peso1 = sc.nextFloat();
        System.out.println("Peso da segunda persoa:");
        peso2= sc.nextFloat();
        if(peso1>peso2){
            System.out.println(nome1 + " pesa mais que " +  nome2 + "Entonces la diferencia es: " + (peso1-peso2));
        }
        else{
            System.out.println(nome2 + "pesa mais que " + nome1 + "Entonces la diferencia es " + (peso2-peso1));
        }
    }
}
