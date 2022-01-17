package Boletin20;

public class Papagaio extends Aves  implements IPodeCamiñar,IPodeNadar {
    public void caminar(){
        System.out.println("caminar");
    }
    public void nadar(){
        System.out.println("nadar");
    }
}
