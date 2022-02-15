package Boletin24;
import LibreriaMarta.LeerDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Libreria {
        public void crearLibro(ArrayList<Libros> lista){
            String titulo;
            String autor;
            String ISB;
            int prezo;
            int unidades;



            titulo=LeerDatos.leerString("titulo: ");
            autor= LeerDatos.leerString("autor: ");
            ISB= LeerDatos.leerString("ISB: ");
            prezo= LeerDatos.leerInt("prezo: ");
            unidades= LeerDatos.leerInt("unidades: ");

            Libros li=new Libros(titulo,autor,ISB,prezo,unidades);
            lista.add(li);
        }

        public void vender(ArrayList<Libros>lista){
            if(lista.isEmpty()==true)
                JOptionPane.showInputDialog(null, "Primero introduce un libro");
            else{
                for(Libros li: lista){
                    if(li.getUnidades()<=0){
                        lista.remove(li);
                    }else
                        li.unidades --;
                }
            }

        }

        public void amosar(ArrayList<Libros>lista){
            if(lista.isEmpty()==true){
                JOptionPane.showInputDialog(null, "Primero introduce un libro");
            }
            else{
                for(Libros li: lista){
                    System.out.println(li);
                }
            }
        }
        public void baixa(String ISBN, ArrayList<Libros>lista){
            if(lista.isEmpty()==true)
                JOptionPane.showInputDialog(null, "Primero introduce un libro");
            else{
                for(Libros li: lista){
                    if(ISBN.equals(li.getISBN())){
                        lista.remove(li);
                        break;
                    }
                }
            }
        }
        public void consultar(String titulo, ArrayList<Libros>lista){
            if(lista.isEmpty()==true)
                JOptionPane.showInputDialog(null,"Primero introduce un libro");
            else{
                for(Libros li: lista){
                    if(titulo.equalsIgnoreCase(li.getTitulo())){
                        JOptionPane.showInputDialog(null, li);
                        break;
                    }
                }
            }
        }
}
