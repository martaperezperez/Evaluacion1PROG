package Boletin6;

import java.util.Scanner;

public class Boletin6_1 {
    public static void main(String[] args) {
        int masVelocidade;
        int menosVelocidade;
        Scanner sc= new Scanner(System.in);

        Coche obxcoche= new Coche();

        obxcoche.getvelocidade();
        masVelocidade= sc.nextInt();
        obxcoche.acelerar(masVelocidade);

       menosVelocidade= sc.nextInt();
        obxcoche.frenar(menosVelocidade);

    }






    public static class Coche {
        private int velocidade ;

        public Coche(){
            velocidade =0 ;
        }

        public int getvelocidade(){
            return velocidade ;
        }

        public void acelerar (int masVelocidad){
            velocidade +=masVelocidad;

        }

        public void frenar(int menosVelocidad){
            velocidade -= menosVelocidad;
        }
    }
}
