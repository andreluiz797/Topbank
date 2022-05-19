package contas;

import contas.Conta;

public class CriarConta {

    public static void main(String[] args) {
        Conta brozeConta = new Conta();
        brozeConta.saldo = 200;
        System.out.println(brozeConta.saldo);

        brozeConta.saldo += 100;
        System.out.println(brozeConta.saldo);

        Conta  prataConta = new Conta();
        prataConta.saldo = 50;

        System.out.println( "bronze conta tem " + brozeConta.saldo);
        System.out.println("prata conta tem " + prataConta.saldo);

        System.out.println(brozeConta.agencia);
        System.out.println(brozeConta.numero);

    }

}
