package Boletin6;

public class Boletin6_3 {
    public static void main(String[] args) {
        Circulo obxcirculo= new Circulo();
        obxcirculo.calcularArea();
        obxcirculo.calcularLonxitude();
        obxcirculo.darresultado();
    }





    public static class Circulo {
        private double radio;
        private final double PI=(Math.PI);
        private double area;
        private double lonxitude;

        public void calcularArea(){
            area= PI*(radio*2);
        }
        public void calcularLonxitude(){
            lonxitude=(2*PI)*radio;
        }
        public void darresultado(){
            System.out.println("el area es: " + area + "y la longitud es: " + lonxitude);
        }
    }
}
