package Boletin6;

public class Boletin6_2 {
    public static void main(String[] args) {
        Satelite obxsatelite= new Satelite();
        obxsatelite.verPosicion();
    }







    public static class Satelite {

        private double meridiano;
        private double paralelo;
        private double distanciaTerra;

        public Satelite(){
            meridiano=paralelo=distanciaTerra=0;

        }

        public Satelite(double m, double p, double d){
            meridiano=m;
            paralelo=p;
            distanciaTerra=d;

        }
        public void verPosicion(){
            System.out.println("O satelite atopase no paralelo " + paralelo +  " meriadiano "  + meridiano+  " a unha distancia da terra " + distanciaTerra);
        }

    }
}
