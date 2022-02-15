package Boletin24;

public class Libros implements Comparable{
    String titulo;
    String autor;
    String ISBN;
    int prezo;
    int unidades;

    public Libros(String titulo, String autor, String ISBN, int prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    Libros(String titulo, String autor, String ISB, int prezo, int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Libros(String titulo, String autor, String isb, int prezo, int unidades) {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public int compareTo(Object o) {
        Libros a=(Libros) o;
        if(this.titulo.compareToIgnoreCase(a.titulo)>0)
            return 1;
        else if(this.titulo.compareToIgnoreCase(a.titulo)<0)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades + '}';
    }




}