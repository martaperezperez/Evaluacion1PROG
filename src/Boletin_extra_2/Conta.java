package Boletin_extra_2;

import java.util.Scanner;

public class Conta {
    //Atributos

    private String nome_do_cliente;
    private String numero_de_conta;
    private double tipo_de_interese;
    private double saldo;

    //Constructores

    public  Conta(){

    }

    public Conta(String ncliente, String nconta, double tinterese , double saldos){

        nome_do_cliente= ncliente;
        numero_de_conta= nconta;
        tipo_de_interese=tinterese;
        saldo= saldos;

    }

    //Metodos

    public void setNomeCliente(String nomecliente){
        nome_do_cliente= nomecliente;
    }



    public String getNomeCliente(){
        return nome_do_cliente;
    }


    public void setNumeroConta(String numeroconta){
        numero_de_conta= numeroconta;
    }


    public String getNumeroConta(){
        return numero_de_conta;
    }


    public void setTipoInterese(double tipointerese){
        tipo_de_interese= tipointerese;
    }


    public double getTipoInterese(){
        return tipo_de_interese;
    }


    public void setSaldo(double Saldo){
        saldo=Saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void ingreso(double ingreso){

        saldo=saldo+ingreso;

    }

    public void reintegro(double reintegro){

        saldo=saldo-reintegro;
    }

    public void transferencia(double cuentaOrigen, double cuentaDestino, double importe){
       cuentaOrigen -=importe;
       cuentaDestino +=importe;

    }


    public void mostrar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("El nombre del cliente es: " + nome_do_cliente);
        nome_do_cliente = sc.next(nome_do_cliente);
        System.out.println("El numero de cuenta es: " + numero_de_conta);
        numero_de_conta = sc.next(numero_de_conta);
        System.out.println("el tipo de interese es: " + tipo_de_interese);
        tipo_de_interese= sc.nextDouble();
        System.out.println("El saldo es: " + saldo);
        saldo = sc.nextDouble();





    }
}
