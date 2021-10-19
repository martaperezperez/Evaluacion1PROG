package Boletin4;

public class Libro {

    class Libro {

        String titulo;
        String autor;
        int ano;
        short numPaginas;
        float valoracion;

        public Libro(String _titulo, String _autor, int _ano, short _numPaginas, float _valoracion){

            titulo = _titulo;
            autor = _autor;
            ano = _ano;
            numPaginas= _numPaginas;
            valoracion= _valoracion;

        }
        public void amosar(){
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + ano);
            System.out.println("Numero de páginas: " + numPaginas);
            System.out.println("Valoración: " + valoracion);
        }
        public void crearLibro(){
            Scanner sc = new Scanner(System.in);
            System.out.println("El titulo del libro:");
            titulo = sc.nextLine();
            System.out.println("El autor del libro:");
            autor= sc.nextLine();
            System.out.println("El año del libro:");
            ano = sc.nextInt();
            System.out.println("Numero de paginas del libro");
            numPaginas = (short) sc.nextInt();
            System.out.println("Valoracion del libro");
            valoracion = sc.nextInt();


        }
    }
