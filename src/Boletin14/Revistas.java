package Boletin14;

public class Revistas extends Publicacion {
    private int numero;

    public Revistas() {
    }

    public Revistas(int numero) {
        this.numero = numero;
    }

    public Revistas(int numero, int codigo, String titulo, int anopublicacion) {
        super(codigo, titulo, anopublicacion);
        this.numero = numero;
    }
    public void mostrar(){

    }

    @Override
    public String toString() {
        return  (super.toString() + "numero=" + numero);
    }

}
