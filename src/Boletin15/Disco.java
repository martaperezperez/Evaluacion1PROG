package Boletin15;

public class Disco extends Multimedia{
    private String xenero;

    public Disco() {
    }

    public Disco(String xenero) {
        this.xenero = xenero;
    }

    public Disco(String xenero, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        return (super.toString()+ "xenero=" + xenero );
    }

}
