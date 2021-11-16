package Boletin11_2;

import javax.swing.*;

public class AdivinarNumero {
    private int num2;
    private int num1;
    private int i;
    private int resta;
    public void Juego(){
        num1=(int) ((Math.random()*50)+1);
        System.out.println("Turno del jugador");
        while(num2!=num1){
            num2= Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero que creas correcto"));
            if (num1>num2){
                resta= num1-num2;
                if(resta>20){
                    System.out.println("moi lonxe");

                }
                else if(resta>=10 && resta<=20){
                    System.out.println("lonxe");

                }
                else if(resta<10 && resta>5){
                    System.out.println("preto");

                }
                else if(resta<=5){
                    System.out.println("moi preto");

                }
            }
            else if(num1<num2){
                resta=num2-num1;
                if(resta>20){
                    System.out.println("moi lonxe");

                }
                else if(resta>=10 && resta<=20){
                    System.out.println("lonxe");

                }
                else if(resta<10 && resta>5){
                    System.out.println("preto");

                }
                else if(resta<=5){
                    System.out.println("moi preto");

                }
            }
            if(num1==num2){
                System.out.println("El numero se adivino");
                break;
            }
        }

    }
}
