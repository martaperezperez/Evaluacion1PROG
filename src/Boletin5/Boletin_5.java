package Boletin5;

public class Boletin_5 {
    public static void main(String[] args) {
        Consumo  obxCon1 = new Consumo();
        obxCon1.crearConsumo();
        obxCon1.mostrarConsumo();



        Consumo obxCon2= new Consumo();
        obxCon2.setGas(1.57);
        obxCon2.setLitro(50);




        Consumo obxCon3= new Consumo(11f,123f,23f,354f);
        obxCon3.mostrarConsumo();

    }

}
