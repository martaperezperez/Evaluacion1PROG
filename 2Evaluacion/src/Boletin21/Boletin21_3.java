package Boletin21;

import javax.swing.*;

public class Boletin21_3 {
    public int [] notaAlumno (int[] notaAlumno){

        for(int i=0; i<notaAlumno.length;i++){
            notaAlumno[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Nota de alumno"));

        }
        return notaAlumno;
    }
    public String []nomeAlumno (String[] nomeAlumno){
        for(int i=0; i< nomeAlumno.length; i++){
            nomeAlumno[i]=JOptionPane.showInputDialog(null, "Nome de Alumno");
        }
        return nomeAlumno;
    }
    public void notasYAlumnos(String [] nomeAlumno, int[]notaAlumno){
        for(int i=0; i < notaAlumno.length; i++){
            nomeAlumno[i]=JOptionPane.showInputDialog(null, "Nome Alumno");
            notaAlumno [i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Nota Alumno"));
            System.out.println(nomeAlumno[i]+ " " + notaAlumno[i]);
        }
    }
    public void notaMedia(int [] notaAlumno){
        float media=(float)0.0;
        for(int i=0; i<notaAlumno.length;i++){
            media= media+ notaAlumno[i];
        }
        System.out.println( "La nota media es:" +(media/5));
    }
    public void notaAlta(int [] notaAlumno){
        int numMayor=0;
        int numMenor=0;
        for(int i=0; i< notaAlumno.length;i++){
            if(notaAlumno[i]>numMayor){
                numMayor=notaAlumno[i];
            }
            else{
                numMenor=notaAlumno[i];
            }
            System.out.println("La nota mas alta es:" +numMayor);
            break;
        }
    }
    public void notaAlumnos(String [] nomeAlumno, int [] notaAlumno){
        String nome= JOptionPane.showInputDialog(null, "Introduce el nombre del alumno  del que necesites la nota");
        for(int i=0; i<notaAlumno.length-1; i++){
            for(int j=0; j<nomeAlumno.length-1; j++){
                if(nomeAlumno[j].equals(nome)){
                    JOptionPane.showInputDialog(null, "La nota del alumno " + nome + "es: " + notaAlumno[i]);
                    break;
                }
            }
            break;
        }
    }

    public void alumnosAprobados(String [] nomeAlumno , int [] notaAlumno){
        for(int i=0 ; i< notaAlumno.length; i++){
            if (notaAlumno[i]>=5){
                System.out.println(notaAlumno[i]+" " + nomeAlumno[i]);
            }
        }
    }
    public void notasOrdenadas (String[] nomeAlumno, int[] notaAlumno){
        int notas;
        String nomes;
        for(int i=0; i<notaAlumno.length-1; i++){
            for (int j=i+1; j<notaAlumno.length; j++){
                if(notaAlumno[i]>notaAlumno[j]){
                    notas= notaAlumno[i];
                    notaAlumno[i]=notaAlumno[j];
                    notaAlumno[j]=notas;
                    nomes= nomeAlumno[i];
                    nomeAlumno[i]=nomeAlumno[j];
                    nomeAlumno[j]=nomes;
                }
            }
        }
        System.out.println("Notas ordenadas");
        for (int i=0; i<notaAlumno.length; i++){
            System.out.println(notaAlumno[i] + nomeAlumno[i]);
        }
    }
}
