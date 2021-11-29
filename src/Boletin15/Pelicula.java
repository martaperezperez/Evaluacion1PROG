package Boletin15;

public class Pelicula extends Multimedia {
    private String actorprincipal;
    private String actrizprincipal;

    public Pelicula() {
    }

    public Pelicula(String actorprincipal, String actrizprincipal) {
        this.actorprincipal = actorprincipal;
        this.actrizprincipal = actrizprincipal;
    }

    public Pelicula(String actorprincipal, String actrizprincipal, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.actorprincipal = actorprincipal;
        this.actrizprincipal = actrizprincipal;
    }

    public void setActorprincipal(String actorprincipal) {
        this.actorprincipal = actorprincipal;
    }

    public void setActrizprincipal(String actrizprincipal) {
        this.actrizprincipal = actrizprincipal;
    }

    @Override
    public String toString() {
        return (super.toString() + "actorprincipal=" + actorprincipal + ", actrizprincipal=" + actrizprincipal);
    }

}
