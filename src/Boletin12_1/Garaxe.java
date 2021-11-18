package Boletin12_1;

import javax.swing.*;

public class Garaxe {
    private int plaza=0;
    private String matricula;
    private long horaentrada;
    private long horasalida;
    private double dinero;
    int eleccion;
    String dato;
    double pago;


    public void pagos(){
        if(horasalida-horaentrada<3){
            dinero=1.5;
        }
        else{
            dinero=1.5+(horasalida-horaentrada)*0.2;
        }

        eleccion = Integer.parseInt(JOptionPane.showInputDialog("1-METER \n 2-QUITAR"));
        if(plaza<5){
            switch(eleccion){
                case 1:{
                    horaentrada= System.currentTimeMillis()/1000/60/60;

                    dato= JOptionPane.showInputDialog(null,"Diganos su matricula");
                    this.matricula= dato;
                    plaza++;
                    eleccion = Integer.parseInt(JOptionPane.showInputDialog("1-METER \n 2-QUITAR"));

                }

                case 2:{
                    if (plaza<5){
                        horasalida=System.currentTimeMillis()/1000/60/60;
                        pago= Double.parseDouble(JOptionPane.showInputDialog(null, "Pague "+dinero));
                        JOptionPane.showMessageDialog(null, "FACTURA\nMatricula del coche: "+matricula+"\nTiempo: "+( horasalida - horaentrada )+" horas\nPrecio: "+dinero+"\nCartos recibidos: "+pago+"\nCartos devoltos: "+(pago-dinero));
                        plaza --;

                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro aparcamiento");
                        eleccion = Integer.parseInt(JOptionPane.showInputDialog("1-METER \n 2-QUITAR"));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No has realizado ningun aparcamiento para relizar el retiro\nGracias por su atencion");
                        eleccion = Integer.parseInt(JOptionPane.showInputDialog("1-METER \n 2-QUITAR"));
                    }

                }

            }
        }
        else if(plaza==5){
            JOptionPane.showInputDialog("No hay mas plazas en el parking");

        }


    }
}
