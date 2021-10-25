package Boletin_extra_2;

public class Boletin_extra_2 {
    public static void main(String[] args) {

        Conta obxconta= new Conta();

        obxconta.getClass();
        obxconta.getNomeCliente();
        obxconta.getNumeroConta();
        obxconta.getSaldo();
        obxconta.getTipoInterese();
        obxconta.ingreso(56);
        obxconta.reintegro(23);
        obxconta.transferencia(345, 3455, 245);
        obxconta.mostrar();
    }

}
