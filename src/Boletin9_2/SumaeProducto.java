package Boletin9_2;

public class SumaeProducto {
    private double suma=0;
    private double producto=1;
    private double i=10;

    public void amosar(){

        while (i<91){
            suma=suma+i;
            producto=producto*i;
            i++;
        }


        System.out.println("La suma es: " + suma + " El producto es: " + producto);

    }

}
