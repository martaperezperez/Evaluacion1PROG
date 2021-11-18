package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio10 {
    private int nota;
    private int i;
    private int acumulador=0;
    private int notafinal;

    public void Ejercicio10(){
        Scanner sc= new Scanner(System.in);
        while(i<6){
            System.out.println("Teclea la nota de cada modulo");
            nota= sc.nextInt();
            i++;
            acumulador=acumulador+nota;
        }

        notafinal=acumulador/6;
        System.out.println("La nota media es: " + notafinal);
    }
}
