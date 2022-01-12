package Boletin18;

public class Boletin18 {
    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        ConversorTemperaturas ex= new ConversorTemperaturas();
        try{
            ex.centigradosAFharenheit();
            ex.centígradosAReamur();
        }catch(ArithmeticException exs){
            System.out.println("error ");
        }
        System.out.println("fin do programa");
    }
}
