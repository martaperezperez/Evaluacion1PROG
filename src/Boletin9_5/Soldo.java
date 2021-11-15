package Boletin9_5;

import javax.swing.*;

public class Soldo {
    private int i=0;
    private int numTrabajadores;
    private int contador1=0;
    private int contador2=0;
    public Soldo(){
    }
    public void soldoDosTrabajadores(){
        numTrabajadores= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de trabajadores"));
        while (i<numTrabajadores){
            int soldo=Integer.parseInt(JOptionPane.showInputDialog("Mete el sueldo de el trabajador" + (i+1)));
            if (soldo>1000 && soldo<1750){
                contador1++;
            }
            else if (soldo<100){
                contador2++;
            }
            i++;
        }
        float contador3=((contador2+100)/numTrabajadores);
        System.out.println("Hay " + contador1 + " trabajadores que cobran entre 1000 y 1750 y hay " + contador3 + "Que no llegan a cobrar 1000€" );
    }
}
