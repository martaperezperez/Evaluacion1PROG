package Boletin22;

public class Goles {
    String [] equipos ={"Celta","Bilbao","Malaga"};
    String []xornadas={"x1","x2","x3"};
    int [][] goles={{3,4,2},{1,2,1},{3,0,1}};

    public void ImprimirTaboa(String [] equipos, String[] xornadas,int[][]goles){
        System.out.println("Eq/xor   ");
        for(int i=0; i<goles.length;i++){
            System.out.println(xornadas[i]);
        }
        for (int i=0; i<goles.length;i++){
            System.out.println(equipos[i]);

            for (int x=0; x<goles[x].length; x++){
                System.out.println("/");
                System.out.println(goles[i][x]);
                System.out.println("/");
            }
        }
    }
}
