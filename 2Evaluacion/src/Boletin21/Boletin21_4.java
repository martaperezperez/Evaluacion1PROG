package Boletin21;

import javax.swing.*;

public class Boletin21_4 {
    int numDNI;
    public void sacarLetra(int [] numero, String []letra){
        numDNI= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los numeros del DNI"));
        int comparar = numDNI%23;
        for(int i=0; i<numero.length; i++){
            if(comparar == numero[i]){
                System.out.println("El DNI " + numero[i] + "tiene la letra " +letra[i]);
            }
        }

    }
}
