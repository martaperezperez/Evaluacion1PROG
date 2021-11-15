package Boletin9_3;

import java.util.Scanner;

public class Area {
    private int area;
    private int base;
    private int altura;
    Scanner sc= new Scanner(System.in);
    public void Areatriangulo(){
        System.out.println("Teclea la base ");
        base= sc.nextInt();
        System.out.println("Teclea la altura");
        altura= sc.nextInt();
        if(base>0 && altura>0){
            area=(base*altura)/2;
        }
        else if(base<1 && altura<1){
            System.out.println("Ten que ser numeros positivos y mayores que 0");
        }
        System.out.println("El area del triangulo es: " + area);
    }
}
