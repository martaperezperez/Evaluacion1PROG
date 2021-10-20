package Boletin5;

import java.util.Scanner;
    public class Consumo {
        //atributos
        private float km;
        private float litros;
        private float vMed;
        private float pGas;
        private float tempo;
        private float consumoMedio;
        private float consumoEuros;

        //constructores
        public Consumo(){

        }

        public Consumo(float Kms, float Litros, float VMed, float PGas) {

            km= Kms;
            litros= Litros;
            vMed= VMed;
            pGas= PGas;

        }
        //Metodos
        public void getTempo(float tempo){
            tempo=km/vMed;

        }

        public float setKms(){
            return km;
        }
        public float setLitro(){
            return litros;
        }
        public float setvMed(){
            return vMed;
        }
        public float setGas(){
            return pGas;
        }





        public void mostrarConsumo(){

            consumoMedio=(litros*(km/100));
            consumoEuros=(pGas*(km/100));


            System.out.println("kilometros percorridos polo coche: " + km);
            System.out.println("Litros de combustible consumido: " + litros);
            System.out.println("Velocidad media; " + vMed);
            System.out.println("Prezo da gasolina: " + pGas);
            System.out.println("Tempo empregado en realizar a viaxe: " + tempo);
            System.out.println("Consumo medio do vehículo: " + consumoMedio);
            System.out.println("Consumo medio en €: " + consumoEuros);
        }

        public void crearConsumo(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Kilometros percorridos polo coche: ");
            km= sc.nextInt();
            System.out.println("Litros de combustible consumido");
            litros= sc.nextInt();
            System.out.println("Velocidad media: ");
            vMed= sc.nextInt();
            System.out.println("Prezo de gasolina: ");
            pGas= sc.nextInt();
        }

    }

}
