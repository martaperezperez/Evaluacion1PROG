package Boletin20;

public class Gato extends Felino implements IPodeCamiñar,IPodeNadar{
    public void camiñar(){
        System.out.println("caminar");
    }
    public void nadar(){
        System.out.println("nadar");
    }
}
