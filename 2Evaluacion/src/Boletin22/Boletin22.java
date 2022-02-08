package Boletin22;

public class Boletin22 {
    public static void main(String[] args) {
        Goles obx= new Goles();
        String[] equipos = {"Celta", "Depor", "Malaga"};
        String[] xornadas = {"X1", "X2", "X3"};
        int[][] goles = {{3,4,2},{1,2,1},{3,0,1}};
        obx.ImprimirTaboa(equipos, xornadas, goles);
    }
}
