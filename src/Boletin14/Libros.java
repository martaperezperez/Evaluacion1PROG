package Boletin14;

public class Libros extends Publicacion {
    private boolean prestados;

    public Libros() {
    }

    public Libros(boolean prestados) {
        this.prestados = prestados;
    }

    public Libros(boolean prestados, int codigo, String titulo, int anopublicacion) {
        super(codigo, titulo, anopublicacion);
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return (super.toString() +"prestados=" + prestados);
    }

}

