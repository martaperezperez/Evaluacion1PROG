package Boletin4;

import java.util.Scanner;

public class Libro {


       private String titulo;
       private String autor;
       private int ano;
       private short numPaginas;
       private float valoracion;

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
        public void setTitulo(String ti){
            titulo=ti;
        }
        public String getTitulo(){
            return titulo;
        }
        public void setAutor(String aut){
            autor= aut;
        }
        public String getAutor(){
            return autor;
        }
        public void setAno(int anyo){
            ano= anyo;
        }
        public int getAno(){
            return ano;
        }
        public void setNumPaginas(short np){
            numPaginas= np;
        }
        public short setNumPaginas(){
            return numPaginas;
        }
        public void setValoracion(float val){
            valoracion= val;
        }
        public float getValoracion(){
            return valoracion;
        }
    }
