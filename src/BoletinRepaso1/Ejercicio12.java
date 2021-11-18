package BoletinRepaso1;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio12 {
    private int nota1;
    private int acumulador1;
    private int i;
    private int notafinal1;
    private int eleccion;
    public void Ejercicio12(){
        Scanner sc= new Scanner(System.in);


        // if (i<3){
        // notafinal1=acumulador1/3;
        // System.out.println("La nota media del primer alumno es: " + notafinal1);
        System.out.println("Quieres calcular la nota media de un alumno'");
        eleccion = Integer.parseInt(JOptionPane.showInputDialog("1-Si \n 2-No"));
        switch (eleccion){
            case 1:{
                if(i<3){
                    System.out.println("Teclea la nota del alumno");
                    nota1= sc.nextInt();
                    i++;
                    acumulador1=acumulador1+nota1;
                }
            }
            case 2:{
                break;
            }
        }
        System.out.println("La nota media es: " + acumulador1);
    }
}
