package Boletin11_1;

import javax.swing.*;

public class Numero {
    private int num1;
    private int num2;
    private int i;


    public void AdivinarNumero(){
        System.out.println("El jugador uno tine que insertar un numero del 1 al 50 ambos incluidos");
        System.out.println("Turno del jugador 1");
        num1= Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        int intentos =Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de intentos que tiene el jugador dos"));
        System.out.println("Turno del jugador 2");
        num2= Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el numero tecleado por el jugador uno"));

        for(i=0; i<intentos; i++){
            if(num1==num2){
                System.out.println("Has acertado");
                break;
            }

            else if (num1>num2){
                System.out.println("El numero a adivinar es mayor que:" + num2);
            }
            else if (num1<num2){
                System.out.println("El numero a adivinar es menor que:" + num2);
            }
            if(i<=1){
                System.out.println("Otro intento");
                num2= Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el numero tecleado por el jugador 1"));
            }
            else if (i==2){

                num2= Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero a adivinar"));
            }
            else if( i>=3){
                System.out.println("Ultimo intento");
                num2=Integer.parseInt(JOptionPane.showInputDialog("teclea el numero a adivinar"));
            }
        }
        System.out.println("Terminaste los intentos");
    }
}
