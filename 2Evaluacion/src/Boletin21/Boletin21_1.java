package Boletin21;

public class Boletin21_1 {
    public int []numeros(int[]numeros){
        for(int x= numeros.length-1;x>=0; x--){
            numeros[x]=(int) (Math.random()*50)+1;
            System.out.println ("Posicion " + x + " --> " + numeros[x]);

        }
        return numeros;
    }
}
