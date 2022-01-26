package Boletin21;

import javax.swing.*;

public class Boletin21_2 {
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
}
