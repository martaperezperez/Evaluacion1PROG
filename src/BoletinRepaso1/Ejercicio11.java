package BoletinRepaso1;

import java.util.Scanner;

public class Ejercicio11 {
    private int nota1, nota2, nota3;
    private int acumulador1, acumulador2, acumulador3;
    private int i;
    private int j;
    private int k;
    private int notafinal1, notafinal2, notafinal3;
    public void Ejercicio11(){
        Scanner sc= new Scanner(System.in);
        while(i<9 && j<9 && k<9){
            if(i<3){
                System.out.println("Teclea la nota del primer alumno");
                nota1= sc.nextInt();
                i++;
                acumulador1=acumulador1+nota1;
            }
            else if(j<3){
                System.out.println("Teclea la nota del segundo alumno");
                nota2= sc.nextInt();
                j++;
                acumulador2=acumulador2+nota2;
            }
            else if(k<3){
                System.out.println("Teclea la nota del tercer alumno");
                nota3= sc.nextInt();
                k++;
                acumulador3=acumulador3+nota3;
            }
            else if (i==3 && j==3 && k==3){
                notafinal1=acumulador1/3;
                notafinal2=acumulador2/3;
                notafinal3=acumulador3/3;
                System.out.println("La nota media del primer alumno es: " + notafinal1);
                System.out.println("La nota media del segundo alumno es: " + notafinal2);
                System.out.println("La nota media del tercer alumno es: " + notafinal3);
                break;
            }
        }
    }
}
