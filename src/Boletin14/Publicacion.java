package Boletin14;

public class Publicacion {
    private int codigo;
    private String titulo;
    private int ano;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, int anopublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = anopublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return ("codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano );
    }



}


