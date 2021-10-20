package Boletin5;

public class Boletin_5 {
    public static void main(String[] args) {
        Consumo  obxCon1 = new Consumo();
        obxCon1.crearConsumo();
        obxCon1.mostrarConsumo();

        Consumo obxCon2= new Consumo();
        obxCon2.setGas();
        obxCon2.setKms();
        obxCon2.setLitro();
        obxCon2.setvMed();
        obxCon2.mostrarConsumo();
        Consumo obxCon3= new Consumo(11f,123f,23f,354f);
        obxCon3.mostrarConsumo();

    }

}
