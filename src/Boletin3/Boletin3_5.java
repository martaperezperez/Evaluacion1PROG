package Boletin3;
import java.util.Scanner;
public class Boletin3_5 {
    public static void main(String[] args) {
  final int RETENCION=36,EUROS_DIA=30, EUROS_KILOMETRO=2;
  final double COMISION_VENTA=0.05, IRPF=0.18;
  double salarioFIjo, importeVentas, kilometrosDesplazados;
  int diasFuera;
  Scanner entradaEscaner= new Scanner (System.in);
  System.out.println("Introduzca el salario fijo: ");
  salarioFIjo= entradaEscaner.nextDouble();
  System.out.println("Introduzca el importe de las ventas del trabajador: ");
  importeVentas= entradaEscaner.nextDouble();
  System.out.println("Introduzca los kilometros totales que ha recorrido el trabajador: ");
  kilometrosDesplazados=entradaEscaner.nextDouble();
  System.out.println("Introduce los dias que ha estado de viaje el trabajador: ");
  diasFuera= entradaEscaner.nextInt();
  double salarioBruto= salarioFIjo+importeVentas*COMISION_VENTA+kilometrosDesplazados*EUROS_KILOMETRO+diasFuera*EUROS_DIA;
  double salarioLíquido=salarioBruto*(1-IRPF)-RETENCION;
  salarioBruto=Math.round(salarioBruto*100)/100;
  salarioLíquido=Math.round(salarioLíquido*100)/100;
  System.out.println("El salario bruto es: " + salarioBruto + " € \n El salario líquido es: " + salarioLíquido + "€");
    }
}
