package Boletin14;

public class Publicacion {
    private int codigo;
    private String titulo;
    private int anopublicacion;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, int anopublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anopublicacion = anopublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnopublicacion() {
        return anopublicacion;
    }

    @Override
    public String toString() {
        return ("codigo=" + codigo + ", titulo=" + titulo + ", anopublicacion=" + anopublicacion );
    }



}

