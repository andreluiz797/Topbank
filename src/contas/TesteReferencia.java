package contas;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta bronzeConta = new Conta();
        bronzeConta.saldo = 300;

        System.out.println("saldo da bronze " + bronzeConta.saldo);

        Conta prataConta = bronzeConta;
        System.out.println("saldo da prata conta " + prataConta.saldo);

        prataConta.saldo += 100;
        System.out.println("saldo da prata conta: " + prataConta.saldo);

        if (bronzeConta == prataConta) {
            System.out.println("sao a mesmissima conta");
        }
    }
}
