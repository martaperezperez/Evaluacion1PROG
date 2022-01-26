package Boletin21;

public class Boletin21 {
    public static void main(String[] args) {
        int [] numero= new int[6];
        Boletin21_1 obx = new Boletin21_1();
        obx.numeros(numero);
        int[]notas = new int[5];
        Boletin21_2 ob= new Boletin21_2();
        ob.notaAlumno(notas);
        ob.nomeAlumno(args);
        ob.notaMedia(notas);
        ob.notaAlta(notas);
        int [] nota = new int[5];
        Boletin21_3 obj=new Boletin21_3();
        obj.notaAlumno(nota);
        obj.nomeAlumno(args);
        obj.notasYAlumnos(args, nota);
        obj.notaMedia(nota);
        obj.notaAlta(nota);
        obj.notaAlumnos(args, nota);
        obj.alumnosAprobados(args, nota);
        obj.notasOrdenadas(args, nota);


        int[] DNI= new int[5];
        Boletin21_4 obje= new Boletin21_4();
        obje.sacarLetra(numero, args);

    }
}
