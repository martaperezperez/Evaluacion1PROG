package Boletin14;

public class Libros extends Publicacion {
    private String prestados;

    public Libros() {
    }

    public Libros(String prestados) {
        this.prestados = prestados;
    }

    public Libros(String prestados, int codigo, String titulo, int anopublicacion) {
        super(codigo, titulo, anopublicacion);
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return (super.toString() +"prestados=" + prestados);
    }
    @Override
    public int getAno(){
        return super.getAno();
    }
    @Override
    public int getCodigo(){
        return super.getCodigo();
    }
}

