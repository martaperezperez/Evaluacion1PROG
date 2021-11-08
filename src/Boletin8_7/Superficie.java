package Boletin8_7;

import javax.swing.*;

public class Superficie {
    private float lado;
    private float base;
    private float altura;
    private float radio;
    private int opcion;
    public void Menu(){
        opcion= Integer.parseInt(JOptionPane.showInputDialog("AREAS \n 1.CUADRADO \n 2.TRIANGULO \n 3.CIRCULO "));

        switch (opcion){
            case 1:{
                lado= Integer.parseInt(JOptionPane.showInputDialog("Lado del cuadrado"));
                JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + lado*lado);
                break;
            }
            case 2: {
                base= Integer.parseInt(JOptionPane.showInputDialog("Base del triangulo"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("La altura del triangulo:"));
                JOptionPane.showMessageDialog(null, "El area del triangulo es: " + (base*altura)/2);
                break;
            }
            case 3: {
                radio=Integer.parseInt(JOptionPane.showInputDialog("Radio de la circunferencia"));
                JOptionPane.showMessageDialog(null,"El area de la circunferencia es: " + 3.14*(radio*radio));
                break;
            }
        }
    }
}
