package LibreriaMarta;

import javax.swing.*;
import java.util.Arrays;

public class MetodosArray {
    public static float[] crearArray(float[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Float.parseFloat(JOptionPane.showInputDialog("Teclea Nota"));
        }
        return lista;
    }

    public void amosarArray(float[] lista) {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Como quieres mostrar el Array?:" + "\n" + "1--> Con For" + "\n" + "2--> Con Foreach" + "\n" + "3--> Coa clase Arrays"));
        switch (op) {
            case 1:
                for (int i = 0; i < lista.length; i++) {
                    System.out.println ("Posicion " + i + " --> " + lista[i]);
                }
                break;
            case 2:
                for (float elemento : lista)
                    JOptionPane.showMessageDialog(null, "elemento");
            case 3:
                System.out.println(Arrays.toString(lista));
                break;
            default:
                System.out.println("Opcion Incorrecta");

        }
    }

    //public void sair(){
    //    System.exit(0);
    //}

    public static int buscarElemento(float[] lista) {
        float elementoBuscar = Float.parseFloat(JOptionPane.showInputDialog("Teclea a posicion desexada:"));
        int atopado = 0; //non está
        int posicion = 0;
        for (int i = 0; i < lista.length; i++) {
            if (elementoBuscar == lista[i]) {
                System.out.println(elementoBuscar + " está na lista");
                posicion = i;
                atopado = 1;
                break;
            }
        }
        if (atopado == 0) {
            System.out.println("NON está");
            posicion = -1;
        }
        return posicion;
    }

    public static void ordenar(float[] lista) {
        float aux = 0;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
        //Arrays.sort(lista);
    }

    public static float[] copiarLista(float[] lista) {
        lista = Arrays.copyOf(lista, 3);
        return lista;
    }

    public static float[] borrarElemento(float[] lista) {

        //buscamos o elemento qu queremos borrar

        int posicion = MetodosArray.buscarElemento(lista);

        //movemos os elementos dende o final ata a posicion borrada

        if(posicion<0)
            System.out.println("*** O elemento non está na lista");
        else {
            for (int i = posicion; i < lista.length - 1; i++) {
                lista[i] = lista[i + 1];
            }
        }

        //copiamos a nova lista co elemento xa borrado

        lista = Arrays.copyOf(lista, lista.length-1);

        //devolvemos a lista

        return lista;

    }

    public static float[]engadir(float[]lista){

        //pedimos o numero a engadir

        float elementoEngadir = Integer.parseInt(JOptionPane.showInputDialog("Inserte o numero que desexa engadir"));

        //copiamos a lista cun elemento mais

        lista = Arrays.copyOf(lista, lista.length+1);

        //asignámoslle o numero o espacio baleiro da nosa lista

        lista[lista.length-1]=elementoEngadir;

        //devlolvemos a lista

        return lista;
    }
}
