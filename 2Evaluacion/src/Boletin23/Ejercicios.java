package Boletin23;

public class Ejercicios {
    public void ejercicio1(){
        String cadena = null;
        System.out.println("esta frase tiene:  " + cadena.length() + "caracteres");
    }
    public void ejercicio2 (){
        String palabra = null;
        char[]caracteres= palabra.toCharArray();
        for(int i=0;i<caracteres.length;i++){
            System.out.println(caracteres[i] +"");
        }
    }
    public void ejercicio3(){
        String frase = null;
        StringBuilder obx= new StringBuilder(frase);
        frase = obx.reverse().toString();
        System.out.println(frase);
    }
    public void ejercicio4(){
        String espacio = null;
        System.out.println(espacio.replaceAll("\\ s+" ,""));
    }
    public void ejercicio5 (){
        String vocales = null;
        int contador=0;
        for(int i=0; i<vocales.length();i++){
            if ((vocales.charAt(i)=='a')||(vocales.charAt(i)=='e')||(vocales.charAt(i)=='i')||(vocales.charAt(i)=='o')||(vocales.charAt(i)=='u')){
                contador ++;
            }
        }
    }
    public void ejercicio6 () {
        String frase= "www. javadesde0. com";
        String[] separado= frase.split("**");
        System.out.println(Arrays.asList(separado));

    }
    public void ejercicio7(String [] mayuscula){
        String palabra;
        palabra = "javeros";
        char [] obx;
        palabra.chars();
        String palabraUpperCase=palabra.toUpperCase();
        String palabraLowerCase = palabra.toLowerCase();
        System.out.println(palabraUpperCase);
        System.out.println(palabraLowerCase);
    }
    public void ejercicio8(String [] comparar){
        String cadena1 = new String ("Java");
        String cadena2 = new String ("JavaScript");
        if(cadena1.equals(cadena2)){
            System.out.println("son iguales");
        }
        else{
            System.out.println("son diferentes");

        }

    }
    public void ejercicio9(){
        String  vocales;
        vocales = "jeve, jeve, jeve";
        vocales=vocales.replace("e", "a");
        System.out.println(vocales);
    }
    public void ejercicio10(){
        String transformar;
        transformar="ABC";
        transformar=transformar.replace("ABCD", "ASCII");
        System.out.println(transformar);
    }
    public void ejercicio11(){
        String frase="Ola, son alumno de DAm1, e son programador desde o 2011";
        String obx= new String();
        int espazos=0;
        int numeros=0;
        for(int i=0; i<frase.length();i++){
            if(frase.charAt(i)== 32){
                espazos ++;
            }
            if(frase.charAt(i)>48 && frase.charAt(i)<=57){
                numeros++;
            }
        }
        System.out.println("la cadena tiene: " + espazos + " espacios en blanco y " +numeros + " numeros" );
    }
}
