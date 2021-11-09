package Boletin9_1;

import javax.swing.*;

public class BucleWhile {
    int i=0;
    int contador0=0;
    int contadorp=0;
    int contadorn=0;
    int num=0;

    public void amosar(){
        while(i<10){
            num= Integer.parseInt(JOptionPane.showInputDialog("teclea un numero"));
            if (num==0){
                contador0++;
            }
            if(num<0){
                contadorn ++;
            }
            if (num>0){
                contadorp ++;
            }
            i++;
        }
        System.out.println("Tienes numero igual a 0: " + contador0 + " Tienes numeros positivos: " + contadorp + " Tienes numeros negativos: " + contadorn + " En total tienes: " +i);

    }

}
